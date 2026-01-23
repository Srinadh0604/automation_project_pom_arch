package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeolocationPage {

    private WebDriver driver;
    private By whereAmIButton = By.tagName("button");

    public GeolocationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openGeolocationPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void clickWhereAmI() {
        driver.findElement(whereAmIButton).click();
    }
    
    public String getPageSource() {
        return driver.getPageSource();
    }
}

