package herokuapp.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisappearingElementsPage {

    private WebDriver driver;
    private By menuItems = By.tagName("li");

    public DisappearingElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openDisappearingElementsPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public int getMenuCount() {
        return driver.findElements(menuItems).size();
    }
}


