package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	@Before
	public void setUp() {
		
		System.out.println("Launch the browser");
	}
	
	@After
	public void tearDown() {
		System.out.println("Quit the browser");
		
	}

	@Given("user launches app url")
	public void user_launches_app_url() {
		System.out.println("user_launches_app_url");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user_enters_username_and_password");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("user_clicks_on_login_button");
	}

	@When("user logged in successful")
	public void user_logged_in_successful() {
		System.out.println("user_logged_in_successful");
	}

	
	

@When("user enters {string} username and password")
public void user_enters_username_and_password(String string) {
    System.out.println("user_enters_username_and_password: "+string);

}

@When("user {string} logged in successful")
public void user_logged_in_successful(String string) {
  
	System.out.println("user_logged_in_successful: "+string);
}


	
//	@When("user enters (.*) username and password")
//	public void user_enters_invalid_username_and_password() {
//
//	}
	

	@When("user shouldBe logged in successful")
	public void user_should_be_logged_in_successful() {

	}

	

	@When("user shouldNot logged in successful")
	public void user_should_not_logged_in_successful() {

	}

}
