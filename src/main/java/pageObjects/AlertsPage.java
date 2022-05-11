package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage {

    public WebDriver driver;

    By alertsTab = By.xpath("//span[text()=\"Alerts\"]");
    By alertButton = By.id("alertButton");
    By timerAlertButton = By.id("timerAlertButton");
    By confirmAlertButton = By.id("confirmButton");
    By confirmResultMessage = By.id("confirmResult");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAlertsTab() {
        return driver.findElement(alertsTab);
    }

    public WebElement getAlertButton() {
        return driver.findElement(alertButton);
    }

    public void acceptAlertPopUp() {
        driver.switchTo().alert().accept();
    }

    public WebElement getTimerAlertButton() {
        return driver.findElement(timerAlertButton);
    }

    public WebElement getConfirmAlertButton() {
        return driver.findElement(confirmAlertButton);
    }
    public String getMessage(){
        return driver.findElement(confirmResultMessage).getText();
    }

}
