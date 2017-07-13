package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePage;
import framework.LoginPage;
import framework.TestRunner;
import org.testng.Assert;

/**
 * Created by mohammadmuntakim on 6/9/17.
 */
public class LoginSD {

    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Facebook - Log In or Sign Up", "Invalid Home Page");
    }

    @When("^I enter (.+) into (username|password) text fields on home screen$")
    public void enterDataIntoTextFields(String text, String textFields) {

        switch (textFields) {
            case "username":
                homePage.enterEmail(text);
                break;
            case "password":
                homePage.enterPassword(text);
                break;
        }
    }

    @When("^I click on login button on home screen$")
    public void clickOnLoginButton() {
        homePage.clickOnLoginButton();
    }

    @Then("^I verify that i am an invalid login page$")
    public void verifyInvalidLoginPage() {
        Assert.assertEquals(loginPage.getPageHeader(), "Log into Facebook");
    }
}
