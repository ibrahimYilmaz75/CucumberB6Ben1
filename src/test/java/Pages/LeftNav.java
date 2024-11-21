package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath="(//span[text()='Parameters'])[1]")
    public WebElement parameters;

    @FindBy(xpath="(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenship;

    @FindBy(xpath = "(//span[text()='States'])[1]")
    public WebElement States;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    public WebElement Nationalities;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    public WebElement Fees;

    @FindBy(xpath = "(//span[text()='Cities'])[1]")
    public WebElement Cities;

    @FindBy(xpath = "(//span[text()='Inventory'])[1]")
    public WebElement inventory;

    @FindBy(xpath = "(//span[text()='Item Categories'])[1]")
    public WebElement itemCategories;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    public WebElement inventorySetup;


    public WebElement getWebElement(String strElement){

        switch (strElement){
            case "setup" : return this.setup;
            case "parameters" : return this.parameters;
            case "countries" : return this.countries;
            case "citizenship" : return this.citizenship;
            case "States" : return this.States;
            case "Nationalities" : return this.Nationalities;
            case "Fees" : return this.Fees;
            case "Cities" : return this.Cities;
            case "inventory" : return this.inventory;
            case "inventorySetup " : return this.inventorySetup;
            case "itemCategories" : return this.itemCategories;
        }
        return null;
    }

}
