package pages;

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

    // Checkbox 1
    public boolean isFirstCheckboxSelected() {
        return getAllCheckboxes().get(0).isSelected();
    }

    public void selectFirstCheckbox() {
        if (!isFirstCheckboxSelected()) {
            getAllCheckboxes().get(0).click();
        }
    }

    // Checkbox 2
    public boolean isSecondCheckboxSelected() {
        return getAllCheckboxes().get(1).isSelected();
    }

    public void unselectSecondCheckbox() {
        if (isSecondCheckboxSelected()) {
            getAllCheckboxes().get(1).click();
        }
    }
}


