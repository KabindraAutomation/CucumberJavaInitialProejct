package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	@Given("User in NetBanking Landing page")
	public void user_in_net_banking_landing_page() {
		System.out.println("Navigating landing page");
		System.out.println();
	}

	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String string, String string2) {

		System.out.println("enter the username " + string);
		System.out.println("enter the password " + string2);
		System.out.println();
	}

	@Then("HomePage is populated")
	public void home_page_is_populated() {
		System.out.println("Navigating Home  page");
		System.out.println();
	}

	@And("Cards displayed are {string}")
	public void cards_displayed_are(String string) {
		System.out.println("card are displayed or not  " + string);
		System.out.println();
	}

	@When("^User sign up with following detail$")
	public void user_sign_up_with_following_details(DataTable data) {
		List<List<String>> list = data.asLists();
		int a = 0;
		for (int i = 0; i <= list.size(); i++) {
			System.out.println(list.get(a).get(i));
			System.out.println();

		}

	}

	@When("^User login in to application with (.+) and (.+)$")
	public void user_login_into_application_with_and(String username, String password) {
		System.out.println("User name " + username);
		System.out.println("password " + password);
		System.out.println();

	}
	   @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
		   System.out.println(" validate the browser");
	       
	    }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	    	System.out.println(" Browser is triggered"); 
	    }

	    @Then("^Check if browser is displayed$")
	    public void check_if_browser_is_started() throws Throwable {
	    	System.out.println("Check if browser is displayed");
	    }

}
