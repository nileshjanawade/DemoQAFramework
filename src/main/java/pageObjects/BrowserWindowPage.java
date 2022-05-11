package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindowPage {

    public WebDriver driver;

    By browsersTab = By.xpath("//span[contains(text(),\"Windows\")]");
    By newTab = By.id("tabButton");
    By childWindowText = By.id("sampleHeading");


    public BrowserWindowPage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getBrowserTab(){
        return driver.findElement(browsersTab);
    }

    public WebElement getNewTabWindow(){
        return driver.findElement(newTab);
    }

    public void swicthToWindow(){
        Set<String> Tabs = driver.getWindowHandles();
        Iterator<String> i=Tabs.iterator();
        String ParentTab = i.next();
        String ChildTab  = i.next();
        driver.switchTo().window(ChildTab);
    }
    public void getTestFromChildWindow(){
        String Text1 =driver.findElement(childWindowText).getText();
        System.out.println(Text1);
    }
}
