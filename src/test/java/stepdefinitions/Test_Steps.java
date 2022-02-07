package stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.TakesScreenshot;


public class Test_Steps {

    public static WebDriver driver;

    @Given("User is on Google home page")
    public void The_internat_is_available() throws Throwable {
        //C:\Users\p7111833\Downloads\chromedriver79
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\p7111833\\Downloads\\chromedriver79\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        //driver.get("https://www.google.com/");
        System.out.println("User is on Google home page");

        //((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    }

    @Given("^the user has accessed the website$")
    public void the_user_has_accessed_the_website() throws Throwable {
        System.out.println("The user has accessed the website");
    }

    @Given("^the shopping page is loaded$")
    public void the_shopping_page_is_loaded() throws Throwable {
        System.out.println("the shopping page is loaded");
    }

    @Given("^User is on Home Page$")
    public void User_is_on_Home_Page() throws Throwable {
        System.out.println("User is on Home Page");
    }

    @When("^User Navigate to LogIn Page$")
    public void User_Navigate_to_LogIn_Page() throws Throwable {
        System.out.println("User Navigate to LogIn Page");
    }

    @When("User enters \"(.*)\" and \"(.*)\"$")
    public void User_enters_UserName_and_Password(String username, String password) throws Throwable {
        driver.findElement(By.cssSelector("input.gLFyf")).sendKeys(username);
        driver.findElement(By.cssSelector("input.gLFyf")).sendKeys(password);
        System.out.println("User enters UserName and Password");
    }

    @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void wheniEnterUPass(String username, String Password) {
        System.out.println("" + username);
        System.out.println("" + Password);
    }

    @Then("^Message displayed Login Successfully$")
    public void Message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Message displayed Login Successfully");
    }

    @When("^User LogOut from the Application$")
    public void User_LogOut_from_the_Application() throws Throwable {
        System.out.println("User LogOut from the Application");
    }

    @Then("^Message displayed LogOut Successfully$")
    public void Message_displayed_LogOut_Successfully() throws Throwable {
        System.out.println("Message displayed LogOut Successfully");
    }

    @And("user types these multiple keystrokes")
    public void multiplekeystrokes(DataTable table) {
		/*System.out.println(keystrokes.getRows());
		List<TableRow> rows = keystrokes.getRows();*/
		/*for (TableRow ro: rows){
			System.out.println(ro.getCells().get(0));
			System.out.println(ro.getCells().get(1));
		}*/
        System.out.println(table.asLists());
        System.out.println(table.asMaps());

        List<String> t = table.asList();
        for (String i : t) {
            System.out.println("ssssssss" + i);
        }
    }

    @And("user types these multiple keystrokes with title datatable")
    public void multiplekeystrokes2(DataTable l1) {
        //List of Maps of <String,String>
        List<Map<String, String>> v = l1.asMaps();

        List<List<String>> str = l1.asList(List.class);

        //ISNT A GREAT IDEA
        for (Map<Object, Object> m : l1.asMaps(String.class, String.class)) {
            System.out.println(m.get("First Name"));
            System.out.println(m.get("Last Name"));
        }

        Map<String, List<String>> s2 = l1.asMap(String.class, List.class);

        for (Map<String, String> vis : v) {
            vis.get("First Name");
            System.out.println(vis.get("First Name"));
            System.out.println(vis.get("Last Name"));
            System.out.println(vis.get("Password"));
        }

    }

    //IF HEADERS ARE PRESENT USE TABLEENTRY TRANSFORMER and register
    @And("User enters Geolocation to LogIn")
    public void GeolocationwithHeader(DataTable tabb) {
        Map<Airport, Geolocation2> g = tabb.asMap(Airport.class, Geolocation2.class);

        for (Entry<Airport, Geolocation2> e : g.entrySet()) {
            System.out.println("GEOO --" + g.get(e.getKey()).getLat());
            System.out.println("GEOO --" + g.get(e.getKey()).getLong());
        }

    }

    // As both the the table row and entry transformer create a list of Geolocation it is recommended that you pick one representation only.
    @And("User enters Geolocation to LogIn2")
    public void GeolocationwithoutHeader(DataTable table) {
        Map<Airport, Geolocation> s = table.asMap(Airport.class, Geolocation.class);
        System.out.println(s);

        //You can get only right side 2 columns
		/*List<Geolocation> l = table.asList(Geolocation.class);
		for(Geolocation gl : l){
			System.out.println(gl.getLat());
			System.out.println(gl.getLong());
		}*/

    }


    @And("user types these multiple keystrokes with title datatable2")
    public void multiplekeystrokes3(DataTable table) {

        Map<String, Map<String, List<String>>> s = table.asMap(String.class, Map.class);

        for (Entry<String, Map<String, List<String>>> v : s.entrySet()) {
            System.out.println("NNNNNNNN" + v.getKey() + v.getValue());
        }
    }
    //THIS WAY DOES NOT WORK WITH CUCUMBER 3.0
	/*@And("User enters Credentials to LogIn")
	public void user_enters_credentials(List<Credentials> userCredentials){
		
		for (Credentials cred : userCredentials){
		 System.out.println("USERNAME"+ cred.getUsername());
		 System.out.println("PASSWORD"+ cred.getPassword());
		}
		
		//System.out.println("USERNAME" + userCredentials.getUsername());
		
		//This way also does not work
		//table.asList(User.class);
		//for loop for traversing through User list
	}*/

    @And("User enters Credentials to LogIn")
    public void user_enters_credentials(DataTable table) {
        List<Credentials> credentialList = table.asList(Credentials.class);
        for (Credentials cred : credentialList) {
            System.out.println(cred.toString());
        }

    }

}
