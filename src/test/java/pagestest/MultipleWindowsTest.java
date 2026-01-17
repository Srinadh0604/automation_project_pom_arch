package pagestest;



import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.MultipleWindowsPage;
import utility.ConfigReader;


public class MultipleWindowsTest extends BaseTest {

    @Test
    public void verifyMultipleWindowsHandling() {

        System.out.println("===== Multiple Windows Test Started =====");

        driver.get(
            ConfigReader.get("baseUrl") +
            ConfigReader.get("windowsUrl")
        );
        System.out.println("Navigated to Multiple Windows page");

        MultipleWindowsPage page = new MultipleWindowsPage(driver);

        // Store parent window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window ID: " + parentWindow);

        // Click link to open new window
        page.clickHere();
        System.out.println("Clicked on 'Click Here' link");

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to new window
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to child window");
            }
        }

        // Validate text in new window
        String text = page.getNewWindowText();
        System.out.println("Text in new window: " + text);

        Assert.assertEquals(text, "New Window",
                "New window text is incorrect");

        // Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Switched back to parent window");

        System.out.println("===== Multiple Windows Test Completed Successfully =====");
    }
}


