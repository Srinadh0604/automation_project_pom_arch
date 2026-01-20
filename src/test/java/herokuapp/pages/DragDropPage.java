package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropPage {

    private WebDriver driver;
    private By columnA = By.id("column-a");
    private By columnB = By.id("column-b");

    public DragDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openDragDropPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void dragAToB() {
        WebElement a = driver.findElement(columnA);
        WebElement b = driver.findElement(columnB);
        new Actions(driver).dragAndDrop(a, b).perform();
    }
}

