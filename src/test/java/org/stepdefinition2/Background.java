package org.stepdefinition2;

import org.baseclass.BaseClass;
import org.pojo.FrgttenPassPojo;
import org.pojo.LoginPojo;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background extends BaseClass {


	@Given("User have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() throws InterruptedException {
		FrgttenPassPojo f = new FrgttenPassPojo();
		btnclick(f.getBtnFrgtPass());
		Thread.sleep(3000);
	}

	@When("User have to enter email or mobileNo")
	public void user_have_to_enter_email_or_mobileNo() {
		FrgttenPassPojo f = new FrgttenPassPojo();
		fill(f.getTxtSearchBox(), "8475998745969");

	}

	@Then("User have to click the search button")
	public void user_have_to_click_the_search_button() {
		FrgttenPassPojo f = new FrgttenPassPojo();
		btnclick(f.getBtnSearch());

	}

	@Given("User is in facebook login page through chrome browser")
	public void user_is_in_facebook_login_page_through_chrome_browser() {
		launchBrowser();
		loadurl("https://www.facebook.com/");
		winmax();

	}

	@When("User have to enter invalid username and invalid password")
	public void user_have_to_enter_invalid_username_and_invalid_password() {
		LoginPojo l = new LoginPojo();

		fill(l.getTxtEmail(), "selenium123@gmail.com");
		fill(l.getTxtPass(), "selenium123");

	}

	@When("User Click the Login button")
	public void user_Click_the_Login_button() throws InterruptedException {
		LoginPojo l = new LoginPojo();
		btnclick(l.getBtnLogin());
		Thread.sleep(2000);

	}

	@Then("User should be in invalid credential Page")
	public void user_should_be_in_invalid_credential_Page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("privacy"), "verifyurl");
		System.out.println("User Navigated to Invalid Page");
	}

	@When("User have to enter valid username and invalid password")
	public void user_have_to_enter_valid_username_and_invalid_password() {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "greens123@gmail.com");
		fill(l.getTxtPass(), "greens123");

	}

	@When("User Clicks the Login Button")
	public void user_Clicks_the_Login_Button() throws InterruptedException {
		LoginPojo l = new LoginPojo();
		btnclick(l.getBtnLogin());
		Thread.sleep(2000);
	}

	@Then("User should be in a invalid Credential Page")
	public void user_should_be_in_a_invalid_Credential_Page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("privacy"), "verifyurl");
		System.out.println("User Navigated to Invalid Page");
		driver.quit();
	}

}
