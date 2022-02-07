package stepdefinitions;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {

    //We are not creating any inheritance like - (class LoginPageSteps extends LoginPage)
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("www.google.com");
    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expected) {
        String title = loginPage.getLoginPageTitle();
        System.out.println("login page title is:-" + title);
        Assert.assertTrue(title.contains(expected));
    }

    @Then("forgot password link should be displayed")
    public void forgot_password_link_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks on Login Button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
