package org.step;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Amazon1 extends CheckClass {
	@Given("launch the  browser and hit url")
	public void launch_the_browser_and_hit_url() {
	//  browserLaunched();
	  getUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D15449401986293376923%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061895%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  max();
	}

	@When("pass the invalid emailid  or phonenum in emailfield")
	public void pass_the_invalid_emailid_or_phonenum_in_emailfield() {
	    driver.findElement(By.name("email")).sendKeys("9876543219");
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
	   driver.findElement(By.id("continue")).click();
	}

	@When("pass the valid password in passwordfield")
	public void pass_the_valid_password_in_passwordfield() {
	    driver.findElement(By.name("password")).sendKeys("subu1234");
	}

	@When("To click a sigin button")
	public void to_click_a_sigin_button() {
	   driver.findElement(By.id("signInSubmit")).click();
	}
	@Then("close the  browser")
	public void close_the_browser() {
//	    quitBrowser();
	}
	@Given("To launch the  browser and hit url")
	public void to_launch_the_browser_and_hit_url() {
	 //  browserLaunched();
	   max();
	getUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D15449401986293376923%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061895%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	}

	@When("pass the valid emailid  or phonenum in emailfield")
	public void pass_the_valid_emailid_or_phonenum_in_emailfield() {
		driver.findElement(By.name("email")).sendKeys("9876543219");
	}

	@When("click the continue button")
	public void click_the_continue_button() {
		   driver.findElement(By.id("continue")).click();

	}

	@When("pass the invalid password in passwordfield")
	public void pass_the_invalid_password_in_passwordfield() {
	    driver.findElement(By.name("password")).sendKeys("subu1234");

	}

	@When("click a sigin button")
	public void click_a_sigin_button() {
		driver.findElement(By.id("signInSubmit")).click();
	}

	@Then("close the  browser in amzon")
	public void close_the_browser_in_amzon() {
	  // quitBrowser();
	}




}
