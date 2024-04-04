package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.FormPage;
import pages.InputFormSubmitPage;
import pages.LambdatestHomePage;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.util.Map;

public class LambdatestStepDefs {
    private WebDriver driver;
    private InputFormSubmitPage isp;

    @Given("I navigate to lambdatest home page")
    public void i_navigate_to_lambdatest_home_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("url_lambdatest");
        driver.navigate().to(url);
    }
    @When("I click Input Form Submit")
    public void i_click_input_form_submit() {
        LambdatestHomePage lhp = new LambdatestHomePage(driver);
        lhp.InputFormSubmitLink.click();
    }
    @Then("I enter all required data in form")
    public void i_enter_all_required_data_in_form() {
        isp = new InputFormSubmitPage(driver);
        isp.nameField.sendKeys("Kazybek");
        isp.emailField.sendKeys("Kazybek@gmail.com");
        isp.passwordField.sendKeys("123456C");
        isp.companyField.sendKeys("Codefish");
        isp.websiteField.sendKeys("Codefish.io");

        Select select1 = new Select(isp.countryDropDown);
        select1.selectByVisibleText("United States");

        isp.cityField.sendKeys("Chicago");
        isp.address1Field.sendKeys("E Devon 2200");
        isp.address2Field.sendKeys("351");
        isp.stateField.sendKeys("IL");
        isp.zipCodeField.sendKeys("60018");

    }
    @Then("I click submit")
    public void i_click_submit() {
        isp.submitButton.click();
    }
    @Then("I validate success message")
    public void i_validate_success_message() {
        FormPage fp = new FormPage(driver);
        String expectedText = fp.formPageText.getText();
        String actualText = "Thanks for contacting us, we will get back to you shortly.";
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("And I fill out the form with following information")
    public void and_i_fill_out_the_form_with_following_information(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> dataMap = dataTable.asMap();

        isp = new InputFormSubmitPage(driver);

        //retrieving values from data table by keys
        String name = dataMap.get("name");
        System.out.println(name);
        isp.nameField.sendKeys(name);

        String email = dataMap.get("email");
        System.out.println(email);
        isp.emailField.sendKeys(email);

        String password = dataMap.get("password");
        System.out.println(password);
        isp.passwordField.sendKeys(password);

        String company = dataMap.get("company");
        System.out.println(company);
        isp.companyField.sendKeys(company);

        String website = dataMap.get("website");
        System.out.println(website);
        isp.websiteField.sendKeys(website);

        String country = dataMap.get("country");
        System.out.println(country);

        Select select1 = new Select(isp.countryDropDown);
        select1.selectByVisibleText(country);

        String city = dataMap.get("city");
        System.out.println(city);
        isp.cityField.sendKeys(city);

        String address1 = dataMap.get("address1");
        System.out.println(address1);
        isp.address1Field.sendKeys(address1);

        String address2 = dataMap.get("address2");
        System.out.println(address2);
        isp.address2Field.sendKeys(address2);

        String state = dataMap.get("state");
        System.out.println(state);
        isp.stateField.sendKeys(state);

        String zipCode = dataMap.get("zipCode");
        System.out.println(zipCode);
        isp.zipCodeField.sendKeys(zipCode);
    }
}
