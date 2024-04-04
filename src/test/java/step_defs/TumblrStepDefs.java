package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.TumblHomePage;
import utils.ConfigUtils;
import utils.DriverUtils;

public class TumblrStepDefs {
    WebDriver driver;

    @Given("I navigate to tumblr home page")
    public void i_navigate_to_tumblr_home_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("urlTumblr");
        driver.navigate().to(url);
    }

    @When("I click to login button")
    public void i_click_to_login_button() {
        TumblHomePage thp = new TumblHomePage(driver);
        thp.loginButton.click();
    }
    @When("I click continue with email")
    public void i_click_continue_with_email() {
        TumblHomePage thp = new TumblHomePage(driver);
        thp.withEmailButton.click();
    }
    @When("I enter {string} email")
    public void i_enter_email(String email) {
        TumblHomePage thp = new TumblHomePage(driver);
        thp.emailInputField.sendKeys(email + Keys.ENTER);
    }
    @When("I enter {string} password")
    public void i_enter_password(String password) {
        TumblHomePage thp = new TumblHomePage(driver);
        thp.passwordInputField.sendKeys(password + Keys.ENTER);
    }
    @Then("I should get {string} error")
    public void i_should_get_error(String expectedError) {
        TumblHomePage thp = new TumblHomePage(driver);
        String actualError = thp.error.getText();
        Assert.assertEquals(expectedError, actualError);
    }
}
