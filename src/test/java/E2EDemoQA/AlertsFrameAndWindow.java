package E2EDemoQA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.AlertsPage;
import pageObjects.LandingPage;
import resources.BasePage;

import java.io.IOException;

public class AlertsFrameAndWindow extends BasePage {
    public WebDriver driver;
    private static Logger log = LogManager.getLogger(HomePage.class.getName());

    @BeforeTest
    public void StartBrowser() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void navigateToAlertsFrameAndWindow() {
        LandingPage le = new LandingPage(driver);
        le.Alerts_Frame_and_Windows().click();
        log.info("opened the Alerts frame and Window page");
    }

    @Test
    public void clickOnAlertTab() {
        AlertsPage ap = new AlertsPage(driver);
        ap.getAlertsTab().click();
        log.info("Cliked on Alert Tab");
        ap.getAlertButton().click();
        ap.acceptAlertPopUp();
        log.info("Validated Alert Popup accepted");
        ap.getConfirmAlertButton().click();
        ap.acceptAlertPopUp();
        ap.getMessage();

        log.info("Validated Timer Alert Popup accepted");
        //Assert.assertFalse(true);


    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
