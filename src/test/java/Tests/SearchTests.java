package Tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private String SEARCH_KEYWORD = "gopro hero";
    private String EXPECTED_SEARCH_QUERY = "q=gopro+hero";


    @Test(priority = 1)
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getHomePage().implicitWait(30);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }

    @Test(priority = 2)
    public void checkProductCount() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getHomePage().implicitWait(30);
        getSearchResultsPage().clickOnActionCameraFilter();
        assertEquals(getActionCameraPage().getSearchResultsCount(), 7);
    }

}
