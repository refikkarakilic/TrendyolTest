package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class LoginPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);

    }
    By loginButton = By.xpath("//button[@type='submit']");

    By errorMessage = By.xpath("//span[@class='message']");
    By usernamebox = By.xpath("//input[@id='login-email']");
    By passwordbox = By.xpath("//input[@id='login-password-input']");

    public void userAtHomePage() {
        driver.get("https://www.trendyol.com/giris");
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkMessage(String username) {
        elementHelper.checkVisible(errorMessage);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeUserNameForUsernameField(String username2) {
        driver.findElement(usernamebox).click();
        elementHelper.sendKey(usernamebox,"abcde");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void writePasswordForPasswordField(String password) {
        driver.findElement(passwordbox).click();
        elementHelper.sendKey(passwordbox,"123456");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
