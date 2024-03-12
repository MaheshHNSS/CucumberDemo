package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Elements {
    WebDriver driver;

    @FindBy(id = "email") public WebElement inputForEmail;
    @FindBy(id = "login-password") public WebElement inputForLoginPassword;
    @FindBy(id = "login") public WebElement loginButton;

    @FindBy(id = "incorrectdetails") public WebElement errorMessage;


    public Login_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
