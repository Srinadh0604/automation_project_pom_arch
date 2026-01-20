package herokuapp.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotSpotBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openContextMenuPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void rightClickOnBox() {
        WebElement box = driver.findElement(hotSpotBox);
        new Actions(driver).contextClick(box).perform();
    }
}

