package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banking_Login_elements {
    WebDriver driver;

    @FindBy(name = "uid") public WebElement inputForUserId;
    @FindBy(name = "password") public WebElement inputForPassword;
    @FindBy(name = "btnLogin") public WebElement loginButton;



    public Banking_Login_elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
