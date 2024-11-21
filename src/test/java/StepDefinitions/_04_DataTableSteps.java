package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _04_DataTableSteps {
    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println(username);
    }

    @When("Write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println(username+" "+password);
    }

    @And("Write username as Datatable")
    public void writeUsernameAdDatatable(DataTable dtUsername) {
        List<String> listUsername= dtUsername.asList();
        for (String user : listUsername)
            System.out.println(user);
    }

    @And("Write username and password as Datatable")
    public void writeUsernameAndPasswordAsDatatable(DataTable dtUserPass) {
        List<List<String>> listUserpass = dtUserPass.asLists();

        for (int i = 0; i < listUserpass.size(); i++) {
            System.out.println(listUserpass.get(i).get(0)+" "
                               +listUserpass.get(i).get(1));

        }
    }
}
