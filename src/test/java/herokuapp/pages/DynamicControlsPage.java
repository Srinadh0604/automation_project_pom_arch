package herokuapp.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage {

    private WebDriver driver;
    private By enableButton = By.xpath("//button[text()='Enable']");
    private By disableButton = By.xpath("//button[text()='Disable']");
    private By inputBox = By.cssSelector("input[type='text']");
    private By messageText = By.id("message");

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openDynamicControlsPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void clickEnableButton() {
        driver.findElement(enableButton).click();
    }

    // Click Disable button
    public void clickDisableButton() {
        driver.findElement(disableButton).click();
    }
    
    
    // Get success message
    public String getMessageText() {
        return driver.findElement(messageText).getText();
    }
    public boolean isInputEnabled() {
        return driver.findElement(inputBox).isEnabled();
    }
    
    // Get input locator (for wait)
    public By getInputLocator() {
        return inputBox;
    }
    
}

