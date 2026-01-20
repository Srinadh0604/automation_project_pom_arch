package herokuapp.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputsPage {

    WebDriver driver;
    By inputBox = By.tagName("input");

    public InputsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openInputsPage(String baseUrl,String path) {
        driver.get(baseUrl + path);
    }

    public void enterValue(String value) {
        driver.findElement(inputBox).sendKeys(value);
    }

    public String getEnteredValue() {
        return driver.findElement(inputBox).getAttribute("value");
    }
}


