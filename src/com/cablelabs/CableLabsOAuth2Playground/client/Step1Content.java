package com.cablelabs.CableLabsOAuth2Playground.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Step1Content extends Composite {

	private static ApiOAuth2UiBinder uiBinder = GWT
			.create(ApiOAuth2UiBinder.class);

	private static final String PROVIDER_URL = "http://192.168.1.4:8090/cableapiprovider/oauth/authorize?";
	private static final String REDIRECT_URL = "http://127.0.0.1:8888/CableLabsOAuth2Playground.html?gwt.codesvr=127.0.0.1:9997&step=2";
	private static final String CLIENT_ID = "apiclient";

	interface ApiOAuth2UiBinder extends UiBinder<Widget, Step1Content> {
	}

	@UiField
	Button authorizeButton;

	public Step1Content() {
		initWidget(uiBinder.createAndBindUi(this));
		authorizeButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Window.Location.assign(PROVIDER_URL + "client_id=" + CLIENT_ID
						+ "&redirect_uri=" + REDIRECT_URL
						+ "&response_type=code&scope=read+write");
			}
		});

	}
}
