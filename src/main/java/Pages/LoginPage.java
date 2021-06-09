package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='identification_phone_or_email']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@id='phone_not_found_email']")
    private WebElement phoneNotFoundForm;

    @FindBy(xpath = "//span[@class='modal_field__error']")
    private WebElement invalidNumberFormat;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginField() {
        return loginField;
    }

    public WebElement getPhoneNotFoundAppear() {
        return phoneNotFoundForm;
    }

    public void loginWithNotRegisteredNumber(final String number) {
        loginField.sendKeys(number, Keys.ENTER);
    }

    public boolean getPhoneNotFoundForm() {
        return phoneNotFoundForm.isDisplayed();
    }

    public WebElement getInvalidNumberFormatAppear() {
        return invalidNumberFormat;
    }

    public boolean getInvalidNumberFormat() {
        return invalidNumberFormat.isDisplayed();
    }

}

