package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.RedirectPage;
import herokuapp.utility.ConfigReader;


public class RedirectTest extends BaseTest {

    @Test
    public void verifyRedirectWorks() {

        RedirectPage page = new RedirectPage(driver);

        page.openRedirectPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("redirectUrl")
        );

        page.clickRedirectLink();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("status_codes"),
                "Redirect did not work"
        );
    }
}

