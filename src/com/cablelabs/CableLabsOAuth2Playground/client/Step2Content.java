package com.cablelabs.CableLabsOAuth2Playground.client;

import com.google.gwt.core.client.GWT;
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
		formFlexTable.setWidget(1, 1, new TextBox());
		Button button = new Button();
		button.setText("Exchange authorization code for tokens");
//		button.getElement().addClassName(style.authorizeButton());
		button.setStyleName(style.authorizeButton());
//		button.setStylePrimaryName(style.authorizeButton());
		cellFormatter.setColSpan(2, 0, 2);
		formFlexTable.setWidget(2, 0, button);

	}

	public Step2Content(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
