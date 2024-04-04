package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoggedInAdminPage;
import pages.OpenMrsLoginPage;
import pages.RegisterAPatientPage;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OpenMrsStepDefs {
    WebDriver driver;
    OpenMrsLoginPage omlp;
    LoggedInAdminPage liap;
    RegisterAPatientPage rpp;

    @Given("I navigate to open mrs login page")
    public void i_navigate_to_open_mrs_login_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("url_openMrs");
        driver.navigate().to(url);
    }
    @When("I login with Admin")
    public void i_login_with_admin() {
        omlp = new OpenMrsLoginPage(driver);
        omlp.usernameField.sendKeys("admin");
        omlp.passwordField.sendKeys("Admin123");
        omlp.pharmacy.click();
        omlp.loginButton.click();
    }
    @Then("I click register new patient")
    public void i_click_register_new_patient() {
        liap = new LoggedInAdminPage(driver);
        liap.registerPatient.click();
    }
    @Then("I enter all required inofrmation")
    public void i_enter_all_required_inofrmation(io.cucumber.datatable.DataTable dataTable) {

        Map<String, List> dataMap = dataTable.asMap(String.class, List.class);
        Map<String, String[]> dataMap2 = dataTable.asMap(String.class,String[].class);
        rpp = new RegisterAPatientPage(driver);

        String givenName = dataMap.get("Name").get(0).toString();
        rpp.givenName.sendKeys(givenName);
//        String familyName = dataMap.get("Name");
//        rpp.familyName.sendKeys(familyName);
////        rpp.nextButton.click();
//
//        String gender = dataMap.get("Gender");
//        rpp.male.sendKeys(gender);
//
//        String bDay = dataMap.get("Birthdate");
//        rpp.birthdateDayField.sendKeys(bDay);
//        String bMonth = dataMap.get("Birthdate");
//        rpp.birthdateMonthField.sendKeys(bMonth);
//        String bYear = dataMap.get("Birthdate");
//        rpp.birthdateYearField.sendKeys(bYear);
//
//        String address1 = dataMap.get("Address");
//        rpp.address1.sendKeys(address1);
//        String address2 = dataMap.get("Address");
//        rpp.address2.sendKeys(address2);
//        String city = dataMap.get("Address");
//        String state = dataMap.get("Address");
//        String zipCode = dataMap.get("Address");
//        rpp.cityVillageField.sendKeys(city);
//        rpp.stateProvinceField.sendKeys(state);
//        rpp.zipCode.sendKeys(zipCode);
//
//        String phoneNumber = dataMap.get("Phone Number");
//        rpp.personNameField.sendKeys(phoneNumber);
//
//        String relationShip = dataMap.get("Relatives");
//        rpp.relationShip.sendKeys(relationShip);
//        String relationShipName = dataMap.get("Relatives");
//        rpp.relationShip.sendKeys(relationShipName);
//
//        rpp.confirmButton.click();


    }
}
