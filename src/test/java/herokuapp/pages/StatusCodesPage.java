package herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodesPage {

    private WebDriver driver;


    public StatusCodesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openStatusCodesPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }


    public String getPageSourceText() {
        return driver.getPageSource();   
    }
}

