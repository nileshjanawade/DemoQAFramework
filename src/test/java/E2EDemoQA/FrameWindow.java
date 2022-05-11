package E2EDemoQA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.FramesPage;
import pageObjects.LandingPage;
import resources.BasePage;

import java.io.IOException;

public class FrameWindow extends BasePage {

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
    public void clickOnFramesTab() {
        FramesPage fp = new FramesPage(driver);
        fp.getFrameTab().click();
        fp.swicthToFrame();
        fp.getTestFromSubFrame();
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
