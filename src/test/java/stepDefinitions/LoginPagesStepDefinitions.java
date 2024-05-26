package stepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginPagesStepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User at home page")
    public void userAtHomePage() {
        loginPage.userAtHomePage();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Check {string} message abouth username")
    public void checkMessageAbouthUsername(String username) {
        loginPage.checkMessage(username);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @When("write {string} for username field")
    public void writeForUsernameField(String username2) {
        loginPage.writeUserNameForUsernameField(username2);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Check {string} message abouth password")
    public void checkMessageAbouthPassword(String error) {
        loginPage.checkMessage(error);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("write {string} for password field")
    public void writeForPasswordField(String password) {
        loginPage.writePasswordForPasswordField(password);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("write Correct {string} for username field")
    public void writeCorrectForUsernameField(String arg0) {
    }

    @When("write False {string} for password field")
    public void writeFalseForPasswordField(String arg0) {
    }

    @Then("Check {string} message abouth don't match")
    public void checkMessageAbouthDonTMatch(String arg0) {
    }
}
