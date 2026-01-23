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

    public void scrollDown(int times) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < times; i++) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        }
    }
}
