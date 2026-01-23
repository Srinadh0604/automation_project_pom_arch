package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage {

    WebDriver driver;

    private By addButton = By.xpath("//button[text()='Add Element']");
    private By deleteButtons = By.className("added-manually");

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElement(int times) {
        for (int i = 0; i < times; i++) {
            driver.findElement(addButton).click();
        }
    }

    public int getDeleteButtonsCount() {
        return driver.findElements(deleteButtons).size();
    }

//    public boolean isDeleteButtonPresent() {
//        return getDeleteButtonsCount() > 0;
//    }

//    public void deleteOneElement() {
//        driver.findElements(deleteButtons).get(0).click();
//        System.out.println("DeleteElement Clicked");
//    }
}
