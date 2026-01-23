package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.TyposPage;
import herokuapp.utility.ConfigReader;


public class TyposTest extends BaseTest {

    @Test(dataProvider = "typosData", dataProviderClass = TestDataProvider.class)
    public void verifyTyposTextDisplayed(String expectedText) {

        TyposPage page = new TyposPage(driver);

        page.openTyposPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("typosUrl")
        );

        Assert.assertTrue(
                page.getPageSource().contains(expectedText),
                "Expected text not displayed on Typos page"
        );
    }
}

