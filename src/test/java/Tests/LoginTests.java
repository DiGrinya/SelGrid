package Tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {

    private String NOT_REGISTERED_NUMBER = "+380111111111";
    private String INVALID_FORMAT_NUMBER = "+3801111111111";

    @Test(priority = 1)
    public void checkTheLoginFunctionalityWithNotRegisteredNumber() {
        getHomePage().clickOnLoginButton();
        getLoginPage().waitVisibilityOfElement(15, getLoginPage().getLoginField());
        getLoginPage().loginWithNotRegisteredNumber(NOT_REGISTERED_NUMBER);
        getLoginPage().waitVisibilityOfElement(15, getLoginPage().getPhoneNotFoundAppear());
        assertTrue(getLoginPage().getPhoneNotFoundForm());
    }

    @Test(priority = 2)
    public void checkTheLoginFunctionalityWithIncorrectNumberFormat() {
        getHomePage().clickOnLoginButton();
        getLoginPage().waitVisibilityOfElement(15, getLoginPage().getLoginField());
        getLoginPage().loginWithNotRegisteredNumber(INVALID_FORMAT_NUMBER);
        getLoginPage().waitVisibilityOfElement(15, getLoginPage().getInvalidNumberFormatAppear());
        assertTrue(getLoginPage().getInvalidNumberFormat());
    }

}
