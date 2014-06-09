package com.cablelabs.CableLabsOAuth2Playground.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class Step2Content extends Composite {

	private static Step2ContentUiBinder uiBinder = GWT
			.create(Step2ContentUiBinder.class);

	interface Step2Style extends CssResource {
		String authorizeButton();
		String decoratorPanel();
	}

	@UiField
	FlexTable formFlexTable;
	
	@UiField
	Step2Style style;

	interface Step2ContentUiBinder extends UiBinder<Widget, Step2Content> {
	}

	public Step2Content() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
		formFlexTable.setCellSpacing(6);
		FlexCellFormatter cellFormatter = formFlexTable.getFlexCellFormatter();

		// Add a title to the form

		cellFormatter.setHorizontalAlignment(0, 0,
				HasHorizontalAlignment.ALIGN_CENTER);

		// Add some standard form options
		formFlexTable.setHTML(1, 0, "Authorization Code :");
		TextBox authCodeTextBox = new TextBox();
		
		String authCode = com.google.gwt.user.client.Window.Location.getParameter("code");
		if(authCode!=null && !authCode.isEmpty() ){
			//user already authorized
			authCodeTextBox.setText(authCode);
			
		}
		formFlexTable.setWidget(1, 1,authCodeTextBox);
		Button button = new Button();
		button.setText("Exchange authorization code for tokens");
		button.setStyleName(style.authorizeButton());
		
		button.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
			}
		});
		cellFormatter.setColSpan(2, 0, 2);
		formFlexTable.setWidget(2, 0, button);

	}

	public Step2Content(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
