package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodesPage {

    private WebDriver driver;
    private By status200Link = By.linkText("200");

    public StatusCodesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openStatusCodesPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void click200Status() {
        driver.findElement(status200Link).click();
    }

    public boolean is200MessageDisplayed() {
        return driver.getPageSource().contains("200 status code");
    }
}

