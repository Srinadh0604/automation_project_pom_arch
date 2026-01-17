package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage {

    WebDriver driver;

    private By iframe = By.id("mce_0_ifr");
    private By textArea = By.id("tinymce");

    public IFramePage(WebDriver driver) {
        this.driver = driver;
    }

    public By getIframeLocator() {
        return iframe;
    }

    public By getTextAreaLocator() {
        return textArea;
    }
}

