package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {

    public WebDriver driver;

    By elements = By.xpath("(//div[@class='card-body'])[1]");
    By forms = By.xpath("//h5[text()='Forms']");
    By alerts_Frame_Windows = By.xpath("//h5[contains(text(),'Alerts')]");
    By widgets = By.xpath("//h5[text()='Widgets']");
    By interactions = By.xpath("//h5[text()='Interactions']");
    By Book = By.xpath("//h5[contains(text(),'Book')]");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement elements() {
        return driver.findElement(elements);
    }

    public WebElement forms() {
        return driver.findElement(forms);
    }

    public WebElement Alerts_Frame_and_Windows() {
        return driver.findElement(alerts_Frame_Windows);
    }

    public WebElement widgets() {
        return driver.findElement(widgets);
    }

    public WebElement interactions() {
        return driver.findElement(interactions);
    }

    public WebElement Book() {
        return driver.findElement(Book);
    }
}
