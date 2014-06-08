package com.cablelabs.CableLabsOAuth2Playground.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class Step1Content extends Composite {

	private static ApiOAuth2UiBinder uiBinder = GWT
			.create(ApiOAuth2UiBinder.class);

	interface ApiOAuth2UiBinder extends UiBinder<Widget, Step1Content> {
	}

	public Step1Content() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Step1Content(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}


}
