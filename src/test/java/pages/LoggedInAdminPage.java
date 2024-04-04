package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedInAdminPage {
    public LoggedInAdminPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//a[@type='button'][4]")
    public WebElement registerPatient;
}
