package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CartPage;
import pages.ProductsPage;
import pages.ItemSauceLabsOnesiePage;
import pages.SauceLoginPage;
import utils.ConfigUtils;
import utils.DriverUtils;

import java.util.List;

public class SaucedemoStepDefs {

    WebDriver driver;
    @Given("I navigate to saucedemo home page")
    public void i_navigate_to_saucedemo_home_page() {
        driver = DriverUtils.getDriver("chrome");
        String url = ConfigUtils.getConfigProp("url3");
        driver.navigate().to(url);
    }
    @When("I should log in")
    public void i_should_log_in() {
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }
    @Then("print out all item names from page")
    public void print_out_all_item_names_from_page() {
        List<WebElement> listOfItems = driver.findElements
                (By.cssSelector(".inventory_item_name")); // "." works only with class attribute
//        for(int i = 0; i < listOfItems.size(); i++){
//            WebElement element = listOfItems.get(i);
//            String text = element.getText();
//            System.out.println(text);
//        }
        for(WebElement item : listOfItems){
            System.out.println(item.getText());
        }
    }
    @When("I login with locked username and password")
    public void i_login_with_locked_username_and_password() {
        SauceLoginPage slp = new SauceLoginPage(driver);
        String username = ConfigUtils.getConfigProp("sauce_locked_username");
        String password = ConfigUtils.getConfigProp("sauce_password");
        //we use here login method
        slp.login(username, password);
    }
    @Then("I should get error message")
    public void i_should_get_error_message() {
        SauceLoginPage slp = new SauceLoginPage(driver);
        String error = slp.getErrorMessage();
        System.out.println(error);
    }

    @When("I login with visual user username and password")
    public void i_login_with_visual_user_username_and_password() {
        SauceLoginPage slp = new SauceLoginPage(driver);
        String username = ConfigUtils.getConfigProp("sauce_visual_username");
        String password = ConfigUtils.getConfigProp("sauce_password");
        slp.login(username,password);
    }
    @Then("I should see {string} item") //we made in dynamic we can put any items
    public void i_should_see_item(String item) {
        ProductsPage productsPage = new ProductsPage(driver);
        if (item.equalsIgnoreCase("backpack")){
            boolean isBackpackDispalyed = productsPage.backpackItem.isDisplayed();
            Assert.assertTrue(isBackpackDispalyed);
        } else if(item.equalsIgnoreCase("onesie")){
            boolean isOnesieDisplayed = productsPage.onesieItem.isDisplayed();
            Assert.assertTrue(isOnesieDisplayed);
        } else {
            Assert.fail("Provided item is not supported yet");
        }
    }
    @Then("price should be {double}")
    public void price_should_be(double price) {
        ProductsPage productsPage = new ProductsPage(driver);
        String priceText = productsPage.onesiePrice.getText();
//        System.out.println(priceText); $7.99
        System.out.println(priceText.substring(1)); //7.99     without $
    }










    @Then("I select the item")
    public void i_select_the_item() {
//        ProductsPage pp = new ProductsPage(driver);
//        pp.sauceLabsOnesieItem.click();
    }
    @Then("Print the price and add to cart and go to cart")
    public void print_the_price_and_add_to_cart_and_go_to_cart() {
//        ItemSauceLabsOnesiePage item = new ItemSauceLabsOnesiePage(driver);
//        String priceText = item.itemPrice.getText();
//        System.out.println(priceText);
//        item.addToCart.click();
//        item.goToCart.click();
    }
    @Then("I validate Sauce Labs Onesie item")
    public void i_validate_sauce_labs_onesie_item() {
//        CartPage cartPage = new CartPage(driver);
//        String itemText = cartPage.item.getText();
//        Assert.assertEquals("Sauce Labs Onesie", itemText);
    }

}
