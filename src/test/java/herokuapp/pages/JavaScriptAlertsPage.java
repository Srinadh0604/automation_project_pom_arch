package herokuapp.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    WebDriver driver;

    private By jsAlertBtn = By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfirmBtn = By.xpath("//button[text()='Click for JS Confirm']");
    private By jsPromptBtn = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickJsAlert() {
        driver.findElement(jsAlertBtn).click();
    }

    public void clickJsConfirm() {
        driver.findElement(jsConfirmBtn).click();
    }

    public void clickJsPrompt() {
        driver.findElement(jsPromptBtn).click();
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }
}

