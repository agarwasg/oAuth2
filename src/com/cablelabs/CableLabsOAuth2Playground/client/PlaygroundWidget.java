package com.cablelabs.CableLabsOAuth2Playground.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class PlaygroundWidget extends Composite{

	private static PlaygroundWidgetUiBinder uiBinder = GWT
			.create(PlaygroundWidgetUiBinder.class);

	 @UiTemplate("PlaygroundWidget.ui.xml")
	interface PlaygroundWidgetUiBinder extends
			UiBinder<Widget, PlaygroundWidget> {
	}

	public PlaygroundWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public PlaygroundWidget(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}



}
