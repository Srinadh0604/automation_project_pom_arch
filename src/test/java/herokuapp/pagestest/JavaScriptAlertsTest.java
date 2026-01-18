package herokuapp.pagestest;



import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.JavaScriptAlertsPage;
import herokuapp.utility.ConfigReader;


public class JavaScriptAlertsTest extends BaseTest {

    @Test
    public void verifyJavaScriptAlerts() {

        driver.get(
            ConfigReader.get("baseUrl") +
            ConfigReader.get("alertsUrl")
        );
        System.out.println("Navigated to JavaScript Alerts page");

        JavaScriptAlertsPage page = new JavaScriptAlertsPage(driver);

        /* ---------- JS ALERT ---------- */
        page.clickJsAlert();
        System.out.println("Clicked JS Alert button");

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.accept();

        Assert.assertTrue(page.getResultText().contains("You successfully clicked an alert"),
                "JS Alert result text mismatch");

        /* ---------- JS CONFIRM ---------- */
        page.clickJsConfirm();
        System.out.println("Clicked JS Confirm button");

        alert = driver.switchTo().alert();
        alert.dismiss();

        Assert.assertTrue(page.getResultText().contains("You clicked: Cancel"),
                "JS Confirm cancel action failed");

        /* ---------- JS PROMPT ---------- */
        page.clickJsPrompt();
        System.out.println("Clicked JS Prompt button");

        alert = driver.switchTo().alert();
        alert.sendKeys("Srinadh");
        alert.accept();

        Assert.assertTrue(page.getResultText().contains("Srinadh"),
                "JS Prompt input not reflected");

        System.out.println("JavaScript Alerts Test Completed Successfully ");
    }
}

