package com.avenuecode;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.avenuecode.bean.FileStatus;

public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	@SpringBean
	private FileStatus fileStatus;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("status", fileStatus.getStatus()));

	}
	
}
