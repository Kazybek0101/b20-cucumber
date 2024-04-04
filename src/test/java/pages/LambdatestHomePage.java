package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LambdatestHomePage {
    public LambdatestHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (linkText = "Input Form Submit")
    public WebElement InputFormSubmitLink;
}
