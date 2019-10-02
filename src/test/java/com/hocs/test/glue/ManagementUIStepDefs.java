package com.hocs.test.glue;

import com.hocs.test.pages.Page;
import com.hocs.test.pages.create_case.CreateCase;
import com.hocs.test.pages.managementUI.Dashboard;
import com.hocs.test.pages.managementUI.TeamManagement;
import com.hocs.test.pages.managementUI.UnitManagement;
import cucumber.api.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;

import static net.serenitybdd.core.Serenity.pendingStep;
import static jnr.posix.util.MethodName.getMethodName;

public class ManagementUIStepDefs extends Page {

    Dashboard dashboard;

    TeamManagement teamManagement;

    UnitManagement unitManagement;

    @When("^I navigate to the \"([^\"]*)\" Management page$")
    public void navigateToSelectedManagementPage(String managementPage) {
        switch (managementPage.toUpperCase()) {
            case "TEAM":
                clickOn(dashboard.addRemoveUsersButton);
                teamManagement.assertTeamManagementPageTitle();
                break;
            case "UNIT":
                clickOn(dashboard.addUnitButton);
                unitManagement.assertUnitManagementPageTitle();
                break;
            default:
                pendingStep(managementPage + " is not defined within " + getMethodName());
        }
    }
}
