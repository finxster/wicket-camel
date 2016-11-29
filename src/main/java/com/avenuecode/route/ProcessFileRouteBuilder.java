package com.avenuecode.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import com.avenuecode.bean.FileStatus;

public class ProcessFileRouteBuilder extends RouteBuilder {

	@Autowired
	private FileStatus fileStatus;

	@Override
	public void configure() throws Exception {
		from("file:src/in").process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {
				String message = exchange.getIn().getBody(String.class);
				if (message.toLowerCase().contains("error")) {
					fileStatus.error();
				} else {
					fileStatus.ok();
				}
			}
		}).log("Message processed!").to("file:target/out");
	}

}
