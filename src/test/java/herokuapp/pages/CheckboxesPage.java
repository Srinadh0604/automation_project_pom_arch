package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CheckboxesPage {

    WebDriver driver;

    // Locator for all checkboxes
    private By checkboxes = By.cssSelector("input[type='checkbox']");

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Get all checkboxes
    private List<WebElement> getAllCheckboxes() {
        return driver.findElements(checkboxes);
    }

        // Click checkbox by index
        public void clickCheckbox(int index) {
            driver.findElements(checkboxes).get(index).click();
        }
        
        // Check if checkbox is selected
        public boolean isCheckboxSelected(int index) {
            return driver.findElements(checkboxes).get(index).isSelected();
        }
    
}


