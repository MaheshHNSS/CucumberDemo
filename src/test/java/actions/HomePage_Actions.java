package actions;

import elements.HomePage_Elements;
import elements.Login_Elements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import steps.Common_Steps;

public class HomePage_Actions {
    private WebDriver driver;
    HomePage_Elements homePageElements;

    public HomePage_Actions(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        homePageElements = new HomePage_Elements(driver);
    }

    public void verifyUserIsOnHomePage(){
        Assert.assertTrue("user is not on home page",homePageElements.profileIcon.isDisplayed());
    }

    public void verifyUserisOnHomePageBanking() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue("Manager link is not visible after login",homePageElements.managerHyperLInk.isDisplayed());

    }
}
