package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.tagName("input");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSliderPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void moveSliderRight() {
        WebElement sliderElement = driver.findElement(slider);
        new Actions(driver).clickAndHold(sliderElement)
                .moveByOffset(50, 0)
                .release()
                .perform();
    }

    public String getSliderValue() {
        return driver.findElement(By.id("range")).getText();
    }
}

