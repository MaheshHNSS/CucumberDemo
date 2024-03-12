package actions;

import elements.Banking_Login_elements;
import elements.Login_Elements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import steps.Common_Steps;

public class Login_Actions {
    private WebDriver driver;
    Login_Elements login_Elements;
    Banking_Login_elements banking_login_elements;
    public Login_Actions(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        login_Elements = new Login_Elements(driver);
        banking_login_elements = new Banking_Login_elements(driver);
    }

    public void enterloginDetails(String email,String password){
        login_Elements.inputForEmail.sendKeys(email);
        login_Elements.inputForLoginPassword.sendKeys(password);
    }

    public void clickLoginButton() throws InterruptedException {
        login_Elements.loginButton.click();
        Thread.sleep(5000);
    }


    public void verifyErrorMessageForInvalidCredentials() {
        Assert.assertEquals(login_Elements.errorMessage.getText(),"Incorrect login details. Please try again.");
    }

    public void loginIntoBankAPP(String userId, String password) {
        banking_login_elements.inputForUserId.sendKeys(userId);
        banking_login_elements.inputForPassword.sendKeys(password);
        banking_login_elements.loginButton.click();

    }
}
