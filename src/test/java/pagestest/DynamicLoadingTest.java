package pagestest;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.DynamicLoadingPage;
import utility.ConfigReader;
import utility.WaitUtils;


public class DynamicLoadingTest extends BaseTest {

    @Test
    public void verifyDynamicLoading() {

        System.out.println(" Dynamic Loading Test Started");

        driver.get(
            ConfigReader.get("baseUrl") +
            ConfigReader.get("dynamicLoadingUrl")
        );
        System.out.println("Navigated to Dynamic Loading page");

        DynamicLoadingPage page = new DynamicLoadingPage(driver);

        page.clickStart();
        System.out.println("Clicked Start button");

        // Explicit wait
        WaitUtils.waitForVisibility(
                driver, page.getHelloTextLocator());

        String text =
            driver.findElement(By.id("finish")).getText();

        System.out.println("Loaded text: " + text);

        Assert.assertTrue(text.contains("Hello World"),
                "Expected text not displayed");

        System.out.println("===== Dynamic Loading Test Completed Successfully =====");
    }
}


