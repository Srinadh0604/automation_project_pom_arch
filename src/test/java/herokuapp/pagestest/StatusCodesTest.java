package herokuapp.pagestest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.StatusCodesPage;
import herokuapp.utility.ConfigReader;



public class StatusCodesTest extends BaseTest {

    @Test(dataProvider = "statusCodeData", dataProviderClass = TestDataProvider.class)
    public void verify200StatusCodePage(String code, String expectedText) {

        StatusCodesPage page = new StatusCodesPage(driver);

        page.openStatusCodesPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("statusCodesUrl")
        );

       driver.findElement(By.linkText(code)).click();

        Assert.assertTrue(
                page.getPageSourceText().contains(expectedText),
                "200 status code page not displayed"
        );
    }
}


