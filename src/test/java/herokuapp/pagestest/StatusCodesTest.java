package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.StatusCodesPage;
import herokuapp.utility.ConfigReader;



public class StatusCodesTest extends BaseTest {

    @Test
    public void verify200StatusCodePage() {

        StatusCodesPage page = new StatusCodesPage(driver);

        page.openStatusCodesPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("statusCodesUrl")
        );

        page.click200Status();

        Assert.assertTrue(
                page.is200MessageDisplayed(),
                "200 status code page not displayed"
        );
    }
}


