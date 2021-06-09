package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ActionCameraPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'GoPro')]")
    private List<WebElement> searchResultsProductInQuestion;


    public ActionCameraPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultsList() {
        return searchResultsProductInQuestion;
    }

    public int getSearchResultsCount() {
        return getSearchResultsList().size();
    }

}
