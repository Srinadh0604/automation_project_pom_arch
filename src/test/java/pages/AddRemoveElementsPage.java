package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage {

    WebDriver driver;

    private By addButton = By.xpath("//button[text()='Add Element']");
    private By deleteButtons = By.className("added-manually");

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElement() {
        driver.findElement(addButton).click();
        System.out.println("AddElement Clicked");
    }

    public int getDeleteButtonsCount() {
        return driver.findElements(deleteButtons).size();
    }

    public boolean isDeleteButtonPresent() {
        return getDeleteButtonsCount() > 0;
    }

    public void deleteOneElement() {
        driver.findElements(deleteButtons).get(0).click();
        System.out.println("DeleteElement Clicked");
    }
}
