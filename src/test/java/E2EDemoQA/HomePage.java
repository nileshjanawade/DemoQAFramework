package E2EDemoQA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import resources.BasePage;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends BasePage {

    private static Logger log = LogManager.getLogger(HomePage.class.getName());

    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver();
        log.info("Driver initialized");
        driver.get("https://demoqa.com/");
        log.info("hit the URL");
        driver.manage().window().maximize();
        log.info("Window Maximized");
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
