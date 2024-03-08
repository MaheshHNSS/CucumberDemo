package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;

public class loginSteps {
    WebDriver driver = new ChromeDriver();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://www.letskodeit.com/login");
    }
    @When("he enters valid credentials")
    public void he_enters_valid_credentials() {
        driver.findElement(By.id("email")).sendKeys("test@email.com");
        driver.findElement(By.id("login-password")).sendKeys("abcabc");


    }
    @When("click on signin button")
    public void click_on_signin_button() throws InterruptedException {
        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);
    }
    @Then("verify he is on home page")
    public void verify_he_is_on_home_page() {
        Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'default-user-profile-pic.png')]")).isDisplayed());
    }

    @Then("verify profile icon")
    public void verify_profile_icon() {
        Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'default-user-profile-pic.png')]")).isDisplayed());
    }

    @When("he enters invalid credentials")
    public void heEntersInvalidCredentials() {
        driver.findElement(By.id("email")).sendKeys("test@email.com");
        driver.findElement(By.id("login-password")).sendKeys("abcabc12");
    }

    @Then("verify error message")
    public void verifyErrorMessage() {
      fail("Message is not displayed");
    }
}
