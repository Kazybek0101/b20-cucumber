package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAPatientPage {
    public RegisterAPatientPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//input[@name='givenName']")
    public WebElement givenName;
    @FindBy (xpath = "//input[@name='familyName']")
    public WebElement familyName;

    @FindBy (id = "next-button")
    public WebElement nextButton;

    @FindBy (xpath = "//*[text()='Male']")
    public WebElement male;

    @FindBy (id = "birthdateDay-field")
    public WebElement birthdateDayField;

    @FindBy (xpath = "//*[text()='May']")
    public WebElement birthdateMonthField;

    @FindBy (id = "birthdateYear")
    public WebElement birthdateYearField;

    @FindBy (id = "address1")
    public WebElement address1;

    @FindBy (id = "address2")
    public WebElement address2;

    @FindBy (id = "cityVillage")
    public WebElement cityVillageField;

    @FindBy (id = "stateProvince")
    public WebElement stateProvinceField;

    @FindBy (id = "postalCode")
    public WebElement zipCode;

    @FindBy (xpath = "//*[@name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy (id = "relationship_type")
    public WebElement relationShip;

    @FindBy (xpath = "//*[@placeholder='Person Name']")
    public WebElement personNameField;

    @FindBy (id = "submit")
    public WebElement confirmButton;


}
