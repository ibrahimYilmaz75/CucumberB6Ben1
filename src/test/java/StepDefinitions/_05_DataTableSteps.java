package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_DataTableSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinkler) {
        List<String> listLinkler= dtLinkler.asList();

        for (int i = 0; i < listLinkler.size(); i++) {

            ln.myClick(ln.getWebElement(listLinkler.get(i)));
        }
    }

    @And("Click on the Element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable dtLinkler) {
        List<String> listLinkler= dtLinkler.asList();

        for (int i = 0; i < listLinkler.size(); i++) {

            dc.myClick(dc.getWebElement(listLinkler.get(i)));
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dtKutuVeYazilar)
    {
        List<List<String>> kutuVeYazilarLists= dtKutuVeYazilar.asLists();
        for (int i = 0; i < kutuVeYazilarLists.size(); i++) {
            WebElement kutu = dc.getWebElement(kutuVeYazilarLists.get(i).get(0));
            dc.mySendKeys(kutu,kutuVeYazilarLists.get(i).get(1));
        }

    }

    @And("User delete the element from dialog")
    public void userDeleteTheElementFromDialog(DataTable dtSlinecekler) {
        List<String> slineceklerLists= dtSlinecekler.asList();
        for (int i = 0; i < slineceklerLists.size(); i++) {
            dc.deleteItem(slineceklerLists.get(i));
        }
    }
}
