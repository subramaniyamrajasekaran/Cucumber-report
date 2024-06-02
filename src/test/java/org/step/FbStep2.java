package org.step;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbStep2 extends CheckClass{
	@Given("launch the chrome browser and hit url")
	public void launch_the_chrome_browser_and_hit_url() {
	  // browserLaunched();
	   getUrl("https://www.facebook.com/");
	   max();
	}
	@When("pass the valid  in{string}emailfield")
	public void pass_the_valid_in_emailfield(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
		System.out.println("email verified");

	}

	@When("pass the valid  in {string}passwordfield")
	public void pass_the_valid_in_passwordfield(String pass) {
	    driver.findElement(By.name("pass")).sendKeys("13423");
	    System.out.println("password verified");

	}
	@When("click the login button")
	public void click_the_login_button() {
	   driver.findElement(By.name("login")).click();
	   System.out.println("click  verified");
	    
	}

	@Then("close the chrome browser")
	public void close_the_chrome_browser() {
		//quitBrowser();

	}

}
