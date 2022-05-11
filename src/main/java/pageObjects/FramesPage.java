package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {
    public WebDriver driver;

    By frameTab = By.xpath("//span[text()=\"Frames\"]");
    By subFrame = By.id("frame1");

    public FramesPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getFrameTab(){
        return driver.findElement(frameTab);
    }

    public void swicthToFrame(){
        driver.switchTo().frame(driver.findElement(subFrame));
    }
    public void getTestFromSubFrame(){
        String Text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(Text);
    }

}
