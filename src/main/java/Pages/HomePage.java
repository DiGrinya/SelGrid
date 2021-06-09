package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@id='loginButton']//div[@data-id='login']")
    private WebElement loginButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
