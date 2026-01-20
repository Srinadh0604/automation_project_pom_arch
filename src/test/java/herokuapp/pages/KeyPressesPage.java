package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputField = By.id("target");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openKeyPressesPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void pressEnterKey() {
        driver.findElement(inputField).sendKeys(org.openqa.selenium.Keys.ENTER);
    }

    public boolean isEnterDetected() {
        return driver.getPageSource().contains("ENTER");
    }
}

