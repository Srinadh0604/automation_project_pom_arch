package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.TyposPage;
import herokuapp.utility.ConfigReader;


public class TyposTest extends BaseTest {

    @Test
    public void verifyTyposTextDisplayed() {

        TyposPage page = new TyposPage(driver);

        page.openTyposPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("typosUrl")
        );

        Assert.assertTrue(
                page.getPageSource().contains("Sometimes"),
                "Expected text not displayed on Typos page"
        );
    }
}

