package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    public FormPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//*[text()='Thanks for contacting us, we will get back to you shortly.']")
    public WebElement formPageText;
}
