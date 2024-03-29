package steps;

import actions.Common_Actions;
import actions.HomePage_Actions;
import actions.Login_Actions;
import io.cucumber.java.en.Then;

public class HomePage_Steps {
    Common_Actions common_actions;
    Login_Actions login_Actions;
    HomePage_Actions homePageActions;

    public HomePage_Steps(Common_Actions common_actions, Login_Actions login_Actions,HomePage_Actions homePage_Actions) {
        this.common_actions = common_actions;
        this.login_Actions = login_Actions;
        this.homePageActions = homePage_Actions;
    }
    @Then("verify profile icon")
    public void verify_profile_icon() {
        homePageActions.verifyUserIsOnHomePage();
    }

    @Then("he is on home page")
    public void heIsOnHomePage() throws InterruptedException {
        homePageActions.verifyUserisOnHomePageBanking();
    }
}
