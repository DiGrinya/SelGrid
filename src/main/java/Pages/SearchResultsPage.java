package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href,'3660')]")
    private WebElement actionCameraSearch;


    @FindBy(xpath = "//option[contains(@value,'24')]")
    private WebElement productsCount;


    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnActionCameraFilter() {
        actionCameraSearch.click();
    }

}
