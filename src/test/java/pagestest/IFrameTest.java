package pagestest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.IFramePage;
import utility.ConfigReader;


public class IFrameTest extends BaseTest {

    @Test
    public void verifyIFrameTextInput() {

        System.out.println("===== iFrame Test Started =====");

        driver.get(
            ConfigReader.get("baseUrl") +
            ConfigReader.get("iframeUrl")
        );

        IFramePage page = new IFramePage(driver);

     // Switch to iframe
        driver.switchTo().frame(
            driver.findElement(page.getIframeLocator())
        );
        System.out.println("Switched to iframe");

        WebElement editor = driver.findElement(page.getTextAreaLocator());

        // ✅ CLEAR USING JAVASCRIPT (CORRECT WAY)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].innerHTML='';", editor);

        // Type new text
        editor.sendKeys("Hello Selenium");
        System.out.println("Entered text inside iframe");

        // Validate
        String actualText = editor.getText();
        System.out.println("Editor text: " + actualText);

        Assert.assertEquals(actualText.trim(), "Hello Selenium",
                "Text inside iframe mismatch");

        // Switch back
        driver.switchTo().defaultContent();
        System.out.println("Switched back to main page");
   

        System.out.println("===== iFrame Test Completed Successfully =====");
    }
}



