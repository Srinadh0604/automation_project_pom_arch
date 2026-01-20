package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationMessagesPage {

    private WebDriver driver;
    private By clickHereLink = By.linkText("Click here");

    public NotificationMessagesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openNotificationPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void clickForNotification() {
        driver.findElement(clickHereLink).click();
    }

    public boolean isNotificationDisplayed() {
        return driver.getPageSource().contains("Action");
    }
}
