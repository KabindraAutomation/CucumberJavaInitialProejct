package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@MobileTest")
	public void beforeValidation() {
		System.out.println("Mobile before hook");
	}

	@After("@MobileTest")
	public void afterValidation1() {
		System.out.println("Mobile After hook");

	}

	@Before("@WebTest")
	public void beforeWebValidation() {
		System.out.println("Web Validation before hook");
	}

	@After("@WebTest")
	public void afterWebValidatio() {
		System.out.println("Web Validation  After hook");

	}

}
