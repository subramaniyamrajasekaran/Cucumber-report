package org.step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class FbStep extends CheckClass {
	@Given("To launch the chrome browser and hit url")
	public void to_launch_the_chrome_browser_and_hit_url() {
		//browserLaunched();
		getUrl("https://www.facebook.com/");
		max();
	}

	@When("To pass the valid emailid in emailfield")
	public void to_pass_the_valid_emailid_in_emailfield(io.cucumber.datatable.DataTable d) {
		WebElement txt = driver.findElement(By.id("email"));
	    txt.sendKeys("subu");
		Map<String, String> mp = d.asMap(String .class, String.class);
		String data = mp.get("email2");
		fillTextBox(txt, data);
		System.out.println("sendkeys");
		
	   	}

	@When("To pass the valid password in passwordfield")
	public void to_pass_the_valid_password_in_passwordfield(io.cucumber.datatable.DataTable d) {
	    WebElement txt1 = driver.findElement(By.name("pass"));
	     txt1.sendKeys("13423");
	     List<Map<String, String>> mp1 = d.asMaps();
	     fillTextBox(txt1, mp1.get(1).get("pass2"));
	     
		System.out.println("passed");
		

	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	   driver.findElement(By.name("login")).click();
		System.out.println("click");

	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		//quitBrowser();
	   
	}



}
