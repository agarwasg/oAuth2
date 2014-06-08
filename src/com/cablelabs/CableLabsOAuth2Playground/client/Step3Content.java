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

public class Step3Content extends Composite {

	private static Step2ContentUiBinder uiBinder = GWT
			.create(Step2ContentUiBinder.class);

	interface Step3Style extends CssResource {
		String authorizeButton();

		String decoratorPanel();

		String textBox();
	}

	@UiField
	FlexTable formFlexTable;

	@UiField
	Step3Style style;

	interface Step2ContentUiBinder extends UiBinder<Widget, Step3Content> {
	}

	public Step3Content() {
		initWidget(uiBinder.createAndBindUi(this));
		formFlexTable.setCellSpacing(6);
		FlexCellFormatter cellFormatter = formFlexTable.getFlexCellFormatter();

		// Add a title to the form

		cellFormatter.setHorizontalAlignment(0, 0,
				HasHorizontalAlignment.ALIGN_CENTER);
		formFlexTable.setHTML(1, 0, "Request Type :  GET");
		// Add some standard form options
		formFlexTable.setHTML(2, 0, "Resource URI :");
		cellFormatter.setColSpan(2, 1, 2);
		TextBox requestUri = new TextBox();
		requestUri.setStyleName(style.textBox());
		formFlexTable.setWidget(2, 1, requestUri);
		Button button = new Button();
		button.setText("Send Request");
		// button.getElement().addClassName(style.authorizeButton());
		button.setStyleName(style.authorizeButton());
		// button.setStylePrimaryName(style.authorizeButton());
		cellFormatter.setColSpan(3, 0, 2);
		formFlexTable.setWidget(3, 0, button);

	}

	public Step3Content(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
