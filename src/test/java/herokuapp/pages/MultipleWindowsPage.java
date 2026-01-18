package herokuapp.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

    WebDriver driver;

    private By clickHereLink = By.linkText("Click Here");
    private By newWindowText = By.tagName("h3");

    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHere() {
        driver.findElement(clickHereLink).click();
    }

    public String getNewWindowText() {
        return driver.findElement(newWindowText).getText();
    }
}

