package com.remorides.steps;

import com.remorides.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStepDefs {

	@Given("^user is able to launch Application Under Test$")
	public void user_launches_Google_webapp() throws Throwable {
		HomePage hp = new HomePage();
		hp.loginAUT();
	}

	@When("user enters valid user name into username feild")
	public void user_enters_valid_user_name_into_username_feild() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("user enters valid password and clicks on login button")
	public void user_enters_valid_password_and_clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("user should be successfully logged in and Dashboard page should be displayed")
	public void user_should_be_successfully_logged_in_and_Dashboard_page_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

}