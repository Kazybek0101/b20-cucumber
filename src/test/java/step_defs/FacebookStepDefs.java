package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.FacebookLoginPage;
import utils.ConfigUtils;
import utils.DriverUtils;

public class FacebookStepDefs {
    private WebDriver driver;
    private FacebookLoginPage flp;

    @Given("I navigate to facebook login page")
    public void i_navigate_to_facebook_login_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("url_facebook");
        driver.navigate().to(url);
    }

    @When("I enter invalid {string} email")
    public void i_enter_invalid_email(String email) {
        flp = new FacebookLoginPage(driver);
        flp.emailField.sendKeys(email + Keys.ENTER);
    }

    @When("I enter invalid {string} password")
    public void i_enter_invalid_password(String password) {
        flp.passwordField.sendKeys(password + Keys.ENTER);
        flp.loginButton.click();
    }

    @Then("I should get {string} error message")
    public void i_should_get_error_message(String expectedError) {
        String actualError = flp.error.getText();
        Assert.assertTrue(actualError.contains(expectedError));
    }


}
