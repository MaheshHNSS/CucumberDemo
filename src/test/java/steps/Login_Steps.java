package steps;

import actions.Common_Actions;
import actions.HomePage_Actions;
import actions.Login_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_Steps {

    Common_Actions common_actions;
    Login_Actions login_Actions;
    HomePage_Actions homePageActions;

    public Login_Steps(Common_Actions common_actions, Login_Actions login_Actions,HomePage_Actions homePage_Actions) {
        this.common_actions = common_actions;
        this.login_Actions = login_Actions;
        this.homePageActions = homePage_Actions;
    }
    @Given("user is on login page")
    public void user_is_on_login_page() {
        common_actions.goToUrl("https://www.letskodeit.com/login");
    }
    @When("he enters valid credentials")
    public void he_enters_valid_credentials() {
        login_Actions.enterloginDetails("test@email.com","abcabc");
    }
    @When("click on signin button")
    public void click_on_signin_button() throws InterruptedException {
      login_Actions.clickLoginButton();
    }
    @Then("verify he is on home page")
    public void verify_he_is_on_home_page() {
        homePageActions.verifyUserIsOnHomePage();
    }

    @When("he enters invalid credentials")
    public void heEntersInvalidCredentials() {
        login_Actions.enterloginDetails("test1@email.com","abcabc");
    }
    @Then("verify error message")
    public void verify_error_message() {
        login_Actions.verifyErrorMessageForInvalidCredentials();
    }

    @Given("user is on bank login page")
    public void userIsOnBankLoginPage() {
        common_actions.goToUrl("https://demo.guru99.com/V1/index.php");
    }

    @When("user enters valid details")
    public void userEntersValidDetails() {
        login_Actions.loginIntoBankAPP("mngr558726","tejYter");
    }
}
