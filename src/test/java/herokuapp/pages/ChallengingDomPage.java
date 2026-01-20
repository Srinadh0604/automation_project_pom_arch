package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChallengingDomPage {

    private WebDriver driver;
    private By blueButton = By.cssSelector(".button");

    public ChallengingDomPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openChallengingDomPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void clickBlueButton() {
        driver.findElement(blueButton).click();
    }
}

