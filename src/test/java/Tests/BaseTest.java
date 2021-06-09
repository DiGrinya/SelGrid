package Tests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


import java.net.MalformedURLException;
import java.net.URL;
import utils.CapabilityFactory;

public class BaseTest {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    private CapabilityFactory capabilityFactory = new CapabilityFactory();

    private static final String MOYO_URL = "https://moyo.ua/";

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setUp(@Optional("firefox") String browser) throws MalformedURLException, InterruptedException {
        driver.set(new RemoteWebDriver(new URL("http://192.168.0.102:4444/wd/hub"), capabilityFactory.getCapabilities(browser)));
        getDriver().manage().window().maximize();
        getDriver().get(MOYO_URL);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() {
        getDriver().close();
    }

    @AfterClass
    void terminate() {
        driver.remove();
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(getDriver());
    }

    public ActionCameraPage getActionCameraPage() {
        return new ActionCameraPage(getDriver());
    }

    public LoginPage getLoginPage() {
        return new LoginPage(getDriver());
    }

}
