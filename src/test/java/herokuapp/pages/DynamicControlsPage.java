package herokuapp.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage {

    private WebDriver driver;
    private By enableButton = By.xpath("//button[text()='Enable']");
    private By inputBox = By.cssSelector("input[type='text']");

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openDynamicControlsPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void clickEnableButton() {
        driver.findElement(enableButton).click();
    }

    public boolean isInputEnabled() {
        return driver.findElement(inputBox).isEnabled();
    }
}

