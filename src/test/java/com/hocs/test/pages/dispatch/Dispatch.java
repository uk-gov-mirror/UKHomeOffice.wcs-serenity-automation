package com.hocs.test.pages.dispatch;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import com.hocs.test.pages.Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class Dispatch extends Page {

    @FindBy(css = "label[for='DispatchDecision-ACCEPT']")
    public WebElementFacade dispatchAcceptRadioButton;

    @FindBy(css = "label[for='DispatchDecision-REJECT']")
    public WebElementFacade dispatchRejectRadioButton;

    @FindBy(xpath = "//a[text()='Are you able to dispatch this? is required']")
    public WebElementFacade areYouAbleToDispatchErrorMessage;

    @FindBy(xpath = "//a[text()='Why are you unable to dispatch this? is required']")
    public WebElementFacade whyAreYouUnableToDispatchErrorMessage;

    @FindBy(xpath = "//textarea[@name='CaseNote_DispatchDecisionReject']")
    public WebElementFacade whyAreYouUnableToDispatchThisTextbox;

    public void enterTextInWhyAreYouUnableToDispatchTextbox() {
        whyAreYouUnableToDispatchErrorMessage.sendKeys("");
    }

    public void assertAreYouAbleToDispatchErrorMessageIsShown() {
        assertThat(areYouAbleToDispatchErrorMessage.getText(), is("Are you able to dispatch this? is required"));
    }

    public void assertWhyAreYouUnableToDispatchErrorMessageIsShown() {
        assertThat(whyAreYouUnableToDispatchErrorMessage.getText(), is("Why are you unable to dispatch this? is required"));
    }

}
