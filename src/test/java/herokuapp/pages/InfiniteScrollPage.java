package herokuapp.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openInfiniteScrollPage(String baseUrl, String path) {
        driver.get(baseUrl + path);
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
