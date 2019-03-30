package com.remorides.pages;

import org.openqa.selenium.By;
import com.remorides.steps.CommonStepDefs;

public class HomePage extends BasePage {

	// Encapsulation has been implemented

	private By userName = By.xpath("//*[@sample='text']");

	public String getUserName() {
		return driver.findElement(userName).getText();
	}

}
