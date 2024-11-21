package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _03_CitizenShipSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to Citizenships")
    public void navigateToCitizenships() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenship);
    }

    @When("Create a Citizenships name as{string} shortName as {string}")
    public void createACitizenshipsNameAsShortNameAs(String arg0, String arg1) {
        String citizenshipName= RandomStringUtils.randomAlphanumeric(8); // 8 tane karışık harf
        String citizenshipShortName= RandomStringUtils.randomNumeric(4); // 4 tane karşık rakam

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,arg0);
        dc.mySendKeys(dc.shortName,arg1);
        dc.myClick(dc.saveButton);
    }

    @Then("Already existy message should be displayed")
    public void alreadyExistyMessageShouldBeDisplayed() {
        dc.verifyMessageContainsText("already");

    }

    @When("user delete name as {string}")
    public void userDeleteNameAs(String deleteName) {
        dc.deleteItem(deleteName);
    }

    @When("Create a CitizenShip")
    public void createACitizenShip() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput,"012LeoqT");
        dc.mySendKeys(dc.shortName,"3593");
        dc.myClick(dc.saveButton);
    }
}
