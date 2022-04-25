package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SenarioOutline {

	static WebDriver driver;

	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String user, String pass) {

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(user);

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pass);

	}

	@When("User Click the Login Button")
	public void user_Click_the_Login_Button() throws InterruptedException {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		Thread.sleep(1000);
	}

	@Then("User should be in Invalid Credential Page")
	public void user_should_be_in_Invalid_Credential_Page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("privacy"),"Verify Url");
		System.out.println("User Navigated to Invalid Page");
		driver.quit();
	}

}
























