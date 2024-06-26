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
    }

    @When("click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("Check {string} message abouth username")
    public void checkMessageAbouthUsername(String username) {
        loginPage.checkMessage(username);
    }


    @When("write {string} for username field")
    public void writeForUsernameField(String username2) {
        loginPage.writeUserNameForUsernameField(username2);
    }

    @Then("Check {string} message abouth password")
    public void checkMessageAbouthPassword(String error) {
        loginPage.checkMessage(error);
    }

    @When("write {string} for password field")
    public void writeForPasswordField(String password) {
        loginPage.writePasswordForPasswordField(password);
    }

    @When("write Correct {string} for username field")
    public void writeCorrectForUsernameField(String correctUsername) {
        loginPage.correctUsernameForUsernameField(correctUsername);
    }

    @When("write False {string} for password field")
    public void writeFalseForPasswordField(String falsePassword) {
        loginPage.falsePasswordForPasswordField(falsePassword);
    }

    @Then("Check {string} message abouth don't match")
    public void checkMessageAbouthDonTMatch(String dontMatch) {
        loginPage.dontMatchErrorMessage(dontMatch);
    }
}
