package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.tagName("input");
    private By rangeValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSliderPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void moveSliderRight(int xOffset) {
        WebElement sliderElement = driver.findElement(slider);
        new Actions(driver).clickAndHold(sliderElement)
                .moveByOffset(xOffset, 0)
                .release()
                .perform();
    }

    public String getSliderValue() {
        return driver.findElement(rangeValue).getText();
    }
}

