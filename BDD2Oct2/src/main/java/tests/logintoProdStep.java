package tests;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintoProdStep {

	@Given("user navigates to facebook website")
	public void user_navigates_to_facebook_website() {
		System.out.println("user_navigates_to_facebook_website");

	}

	@When("user validates the homepage title")
	public void user_validates_the_homepage_title() {
		System.out.println("user_validates_the_homepage_title");
	}

	@Then("user entered {string}")
	public void user_entered(String string) {
		System.out.println("user_entered");

	}

	@Then("user validates the captcha image")
	public void user_validates_the_captcha_image() {
		System.out.println("user_validates_the_captcha_image");
	}

	@Then("user	\"shouldBe\" successfully logged in")
	public void user_should_be_successfully_logged_in() {
		System.out.println("user_should_be_successfully_logged_in");
	}

	@Then("user	\"shouldNotBe\" successfully logged in")
	public void user_should_not_be_successfully_logged_in() {
		System.out.println("user_should_not_be_successfully_logged_in");
	}

	@Then("user	\"loginType\" successfully logged in")
	public void user_login_type_successfully_logged_in() {
		System.out.println("user_login_type_successfully_logged_in");
	}
	



	

}
