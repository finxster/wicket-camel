package com.avenuecode.route;

import org.apache.camel.builder.RouteBuilder;

public class FileRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:src/data")
                .log("Message received!")
                .to("file:target/messages");
	}

}
