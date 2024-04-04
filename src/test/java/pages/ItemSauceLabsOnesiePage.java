package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemSauceLabsOnesiePage {
    public ItemSauceLabsOnesiePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (css = ".inventory_details_price")
    public WebElement itemPrice;
    @FindBy (css = "#add-to-cart")
    public WebElement addToCart;
    @FindBy (css = ".shopping_cart_link")
    public WebElement goToCart;

}
