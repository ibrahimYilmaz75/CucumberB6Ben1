package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css="[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement headText;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName' ]//input")
    public WebElement shortName;

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteButton;

    @FindBy(xpath = "//mat-dialog-actions//button[@type='submit']")
    public WebElement deleteDialog;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.INTEGRATION_CODE']//input")
    public WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@placeholder='GENERAL.FIELD.PRIORITY']//input")
    public WebElement priority;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button")
    public WebElement toggleBar;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]//span")
    public WebElement countries;

    @FindBy(xpath = "(//mat-option[@role='option'])[3]//span")
    public WebElement country;

    @FindBy(xpath = "//input[@placeholder='User Type']")
    public WebElement userType;

    @FindBy(xpath = "//span[text()=' Administrator ']")
    public WebElement userTypeOption;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> nameList;


    public void verifyMessageContainsText(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        Assert.assertTrue( this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }
    public void deleteItem(String deleteName){
        mySendKeys(searchInput,deleteName);
        myClick(searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));
        myClick(deleteButton);
        myClick(deleteDialog);
    }
    public WebElement getWebElement(String strElement){

        switch (strElement){
            case "addButton" : return this.addButton;
            case "saveButton" : return this.saveButton;
            case "nameInput" : return this.nameInput;
            case "codeInput" : return this.codeInput;
            case "searchInput" : return this.searchInput;
            case "shortName" : return this.shortName;
            case "integrationCode" : return this.integrationCode;
            case "priority" : return this.priority;
            case "countries" : return this.countries;
            case "country" : return this.country;
            case "User Type" : return this.userType;
            case "User Type Option" : return this.userTypeOption;
            case "toggleBar" : return this.toggleBar;
        }
        return null;
    }
}
