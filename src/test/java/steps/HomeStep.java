package steps;

import java.util.ArrayList;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Setup;
import pages.Controller;
import pages.HomePage;

public class HomeStep {
	Controller controller; 
	HomePage homepage; 
	ArrayList<String> listpages = new ArrayList<String>();
	
	public HomeStep(Controller controller, HomePage homepage){
		this.controller = controller; 
		this.homepage = homepage; 
	
	}
	
	
	@Given("^that a user is on valtech website$")
	public void that_a_user_is_on_valtech_website() throws Throwable {
		Setup setup = new Setup(controller);
		setup.Initialisation();
	}

	@Then("^user should see recent blogs correctly$")
	public void user_should_see_recent_blogs_correctly() throws Throwable {
		Assert.assertSame("recent blogs", 	homepage.RecentBlogs());
	}
	
	
	//Second Scenario
	@Given("^Customer is on Valtech website$")
	public void customer_is_on_Valtech_website() throws Throwable {
		Setup setup = new Setup(controller);
		setup.Initialisation();

	}
	
	@When("^a user navigate to about service and work$")
	public void a_user_navigate_to_about_service_and_work() throws Throwable {
	
		listpages = homepage.TopNavigationMenu();
	}

	@Then("^the user should see the page correctly$")
	public void the_user_should_see_the_page_correctly() throws Throwable {
		
		for(Object listmenu : listpages){
			
		boolean serviceText =listmenu.equals("Services");
		Assert.assertTrue(serviceText);
		}
	
	}

	//Third scenario
	@When("^Navigates to contact section to count the number of offices$")
	public void navigates_to_contact_section_to_count_the_number_of_offices() throws Throwable {
	
	}


	@Then("^Number of offices should be (\\d+)$")
	public void number_of_offices_should_be(int arg1) throws Throwable {
	
		
	
	
	}

}
