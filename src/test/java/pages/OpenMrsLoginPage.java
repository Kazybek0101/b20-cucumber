package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMrsLoginPage {
    public OpenMrsLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (id = "username")
    public WebElement usernameField;
    @FindBy (id = "password")
    public WebElement passwordField;
    @FindBy (id = "Pharmacy")
    public WebElement pharmacy;
    @FindBy (id = "loginButton")
    public WebElement loginButton;
}
