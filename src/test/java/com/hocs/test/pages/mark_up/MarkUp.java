package com.hocs.test.pages.mark_up;

import com.hocs.test.pages.Page;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MarkUp extends Page {

    @FindBy(id = "")
    private WebElementFacade policyResponseRadioButton;

    @FindBy(id = "")
    private WebElementFacade referToOgdRadioButton;

    @FindBy(id = "")
    private WebElementFacade faqRadioButton;

    @FindBy(id = "")
    private WebElementFacade noReplyNeededRadioButton;

    @FindBy(id = "")
    private WebElementFacade allocationNoteFreeTextField;

    @FindBy(id = "")
    private WebElementFacade dateReceivedField;

    @FindBy(id = "")
    private WebElementFacade draftingDeadlineField;

    @FindBy(id = "")
    private WebElementFacade finalDeadlineField;

    @FindBy(id = "")
    private WebElementFacade addATopicButton;

    @FindBy(id = "")
    private WebElementFacade primaryTopicRadioButton;

    @FindBy(id = "")
    private WebElementFacade answeringUnitDropdown;

    @FindBy(id = "")
    private WebElementFacade answeringUnitTypeFunction;

    @FindBy(id = "")
    private WebElementFacade answeringTeamTypeFunction;

    @FindBy(id = "")
    private WebElementFacade answeringTeamDropdown;

    @FindBy(id = "")
    private WebElementFacade signOffMinisterDropdown;

    @FindBy(id = "")
    private WebElementFacade signOffMinisterTypeFunction;

    public void clickAddTopic() {
        addATopicButton.click();
    }

    public void clickFaqRadioButton() {
        faqRadioButton.click();
    }

    public void clickNoReplyNeededRadioButton() {
        noReplyNeededRadioButton.click();
    }

    public void clickPolicyResponseRadioButton() {
        policyResponseRadioButton.click();
    }

    public void clickReferToOgdRadioButton() {
        referToOgdRadioButton.click();
    }

    public void enterAllocationNoteFreeText() {
        allocationNoteFreeTextField.sendKeys(generateRandomString());
    }

    public void enterAnsweringTeamTypeFunction(String team) {
        answeringTeamTypeFunction.sendKeys(team);
    }

    public void enterAnsweringUnitTypeFuntion(String unit) {
        answeringUnitTypeFunction.sendKeys(unit);
    }

    public void enterDateReceived() {
        dateReceivedField.sendKeys(today());
    }

    public void enterDraftingDeadline() {
        draftingDeadlineField.sendKeys();
    }

    public void enterFinalDeadline() {
        finalDeadlineField.sendKeys();
    }

    public void enterSignOffMinisterTypeFunction(String minister) {
        signOffMinisterTypeFunction.sendKeys(minister);
    }

    public void selectAnsweringTeamFromDropdownByText(String team) {
        answeringTeamDropdown.selectByVisibleText(team);
    }

    public void selectAnsweringUnitFromDropdownByText(String unit) {
        answeringUnitDropdown.selectByVisibleText(unit);
    }

    public void selectSignOffMinisterFromDropdownByText(String minister) {
        signOffMinisterDropdown.selectByVisibleText(minister);
    }

    public void selectSecondAnsweringTeamFromDropdown() {
        answeringTeamDropdown.selectByIndex(1);
    }

    public void selectSecondAnsweringUnitFromDropdown() {
        answeringUnitDropdown.selectByIndex(1);
    }

    public void selectSecondSignOffMinisterFromDropdown() {
        signOffMinisterDropdown.selectByIndex(1);
    }


}