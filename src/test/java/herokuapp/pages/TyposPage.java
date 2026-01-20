package herokuapp.pages;

import org.openqa.selenium.WebDriver;

public class TyposPage {

    private WebDriver driver;

    public TyposPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openTyposPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public String getPageSource() {
        return driver.getPageSource();
    }
}


