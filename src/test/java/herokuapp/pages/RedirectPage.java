package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RedirectPage {

    private WebDriver driver;
    private By redirectLink = By.id("redirect");

    public RedirectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openRedirectPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void clickRedirectLink() {
        driver.findElement(redirectLink).click();
    }
}
