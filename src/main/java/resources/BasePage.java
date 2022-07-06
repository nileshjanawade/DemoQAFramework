package resources;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public WebDriver driver;
    public Properties prop ;

    public WebDriver initializeDriver() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream("D:\\Project_DemoQA\\src\\main\\java\\resources\\data.properties");
        prop.load(fis);
        WebDriver driver =WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }

    public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) this.driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".jpg";
        FileUtils.copyFile(source,new File(destinationFile));
        return destinationFile;
    }
}
