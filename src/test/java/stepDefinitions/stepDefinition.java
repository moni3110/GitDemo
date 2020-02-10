package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //throw new PendingException();
System.out.println("netbanking landing page");
System.out.println("netbanking landing page test git1");
System.out.println("netbanking landing page test git2");
System.out.println("netbanking landing page test git3");
System.out.println("netbanking landing page test git4");
System.out.println("Gixt X changes");
System.out.println("git develop branch");
System.out.println("dgitx develop");
    }
    
    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        //throw new PendingException();
    	System.out.println("UserName= "+strArg1);
    	System.out.println("Password= "+strArg2);
    }
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        //throw new PendingException();
    	List<List<String>> obj=data.raw();
    	System.out.println("name="+obj.get(0).get(0));
    	System.out.println("pwd="+obj.get(0).get(1));
    	System.out.println("email="+obj.get(0).get(2));
    	System.out.println("address="+obj.get(0).get(3));
    	System.out.println("pin="+obj.get(0).get(4));
    }
    @When("^User login on application with (.+) and (.+)$")
    public void user_login_on_application_with_and(String username, String password) throws Throwable {
       // throw new PendingException();
    	System.out.println(username);
    	System.out.println(password);
    }
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
       // throw new PendingException();
    	System.out.println("User is on home page");
    }

    @And("^Crards displayed are \"([^\"]*)\"$")
    public void crards_displayed_are_something(String strArg1) throws Throwable {
        //throw new PendingException();
    	System.out.println("Cards displayed are="+strArg1);
    }
    
}