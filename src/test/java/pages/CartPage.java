package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = "#item_2_title_link")
    public WebElement item;
}
