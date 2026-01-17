package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    WebDriver driver;

    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    private Select getSelectObject() {
        WebElement dropdownElement = driver.findElement(dropdown);
        return new Select(dropdownElement);
    }

    public String getSelectedOption() {
        return getSelectObject()
                .getFirstSelectedOption()
                .getText();
    }

    public void selectOptionByVisibleText(String option) {
        getSelectObject().selectByVisibleText(option);
    }
}

