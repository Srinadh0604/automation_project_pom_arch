package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.RedirectPage;
import herokuapp.utility.ConfigReader;


public class RedirectTest extends BaseTest {

    @Test(dataProvider = "redirectData", dataProviderClass = TestDataProvider.class)
    public void verifyRedirectWorks(String expectedUrlPart) {

        RedirectPage page = new RedirectPage(driver);

        page.openRedirectPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("redirectUrl")
        );

        page.clickRedirectLink();

        Assert.assertTrue(
                driver.getCurrentUrl().contains(expectedUrlPart),
                "Redirect did not work"
        );
    }
}

