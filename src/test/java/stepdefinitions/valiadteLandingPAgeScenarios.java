package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class valiadteLandingPAgeScenarios {

    WebDriver driver;

    @Given("Launch the chrome browser")
    public void launchTheChromeBrowser() {
        driver=new ChromeDriver();

    }


    @And("Naviagte to the goole url")
    public void naviagteToTheGooleUrl() {
        driver.get("https://www.google.co.in/");
    }

    @When("Maximize the window")
    public void maximizeTheWindow() {
        driver.manage().window().maximize();
    }


    @Then("validate the google landing page")
    public void validateTheGoogleLandingPage() {
        Assert.assertEquals("Google",driver.getTitle());
    }

    @And("Enter valid username and password")
    public void enterValidUsernameAndPassword() {
        System.out.println(" creadtiatls entered");
    }

    @Then("Valiadte user is login successfully")
    public void valiadteUserIsLoginSuccessfully() {
        System.out.println("login succesfully!!!");
    }
}
