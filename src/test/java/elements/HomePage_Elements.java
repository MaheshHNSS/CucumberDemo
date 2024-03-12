package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Elements {
    WebDriver driver;

    @FindBy(xpath = "//img[contains(@src,'default-user-profile-pic.png')]") public WebElement profileIcon;

    @FindBy(xpath = "//a[.='Manager']") public WebElement managerHyperLInk ;

    public HomePage_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
