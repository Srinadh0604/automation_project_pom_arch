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

    public void openPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }
    
    public void clickAlert(String type) {
        if (type.equalsIgnoreCase("alert")) {
            driver.findElement(jsAlertBtn).click();
        } 
        else if (type.equalsIgnoreCase("confirm")) {
            driver.findElement(jsConfirmBtn).click();
        } 
        else if (type.equalsIgnoreCase("prompt")) {
            driver.findElement(jsPromptBtn).click();
        }
    }

 
}

