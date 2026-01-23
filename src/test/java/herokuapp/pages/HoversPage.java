package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By firstImage = By.className("figure");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHoversPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void hoverOnFirstImage() {
        WebElement image = driver.findElement(firstImage);
        new Actions(driver).moveToElement(image).perform();
    }

    public String getPageSource() {
        return driver.getPageSource();
    }
}

