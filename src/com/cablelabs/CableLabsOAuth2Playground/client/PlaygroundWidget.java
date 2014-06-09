package com.cablelabs.CableLabsOAuth2Playground.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.StackPanel;
import com.google.gwt.user.client.ui.Widget;

public class PlaygroundWidget extends Composite{

	private static PlaygroundWidgetUiBinder uiBinder = GWT
			.create(PlaygroundWidgetUiBinder.class);

	 @UiTemplate("PlaygroundWidget.ui.xml")
	interface PlaygroundWidgetUiBinder extends
			UiBinder<Widget, PlaygroundWidget> {
	}
	 
	 @UiField
	 StackLayoutPanel stackPanel;

	public PlaygroundWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		String value = com.google.gwt.user.client.Window.Location.getParameter("code");
		if(value!=null && !value.isEmpty() ){
			//user already authorized
			stackPanel.showWidget(1);
			
		}
		
	}

	public PlaygroundWidget(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}



}
