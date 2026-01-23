package herokuapp.pagestest;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.DynamicLoadingPage;
import herokuapp.utility.ConfigReader;
import herokuapp.utility.WaitUtils;


public class DynamicLoadingTest extends BaseTest {

    @Test(dataProvider = "dynamicLoadingData", dataProviderClass = TestDataProvider.class)
    public void verifyDynamicLoading(String expectedText) {

        System.out.println(" Dynamic Loading Test Started");
        
        DynamicLoadingPage page = new DynamicLoadingPage(driver);

        driver.get(
            ConfigReader.get("baseUrl") +
            ConfigReader.get("dynamicLoadingUrl")
        );
        System.out.println("Navigated to Dynamic Loading page");


        page.clickStart();
        System.out.println("Clicked Start button");

        // Explicit wait
        WaitUtils.waitForElementVisible(
                driver, page.getHelloTextLocator());

        

        Assert.assertTrue( driver.getPageSource().contains(expectedText),
                "Dynamic text not loaded");

        System.out.println("===== Dynamic Loading Test Completed Successfully =====");
    }
}


