package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    WebDriver driver;

    private By startButton = By.xpath("//button[text()='Start']");
    private By helloText = By.id("finish");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart() {
        driver.findElement(startButton).click();
    }

    public By getHelloTextLocator() {
        return helloText;
    }
}


