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

    public void userAtHomePage() {
        driver.get("https://www.trendyol.com/giris");
    }

    public void clickLogin() {

    }
}
