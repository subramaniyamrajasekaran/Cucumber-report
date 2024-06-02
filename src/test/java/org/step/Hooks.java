package org.step;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CheckClass {
	@Before
	public void bfscenario() {
		browserLaunched();
		System.out.println("each scenario before only once");
	}
	@After
	public void afscenario() {
    quitBrowser();
    System.out.println("each scenario after only once");
	}

}
