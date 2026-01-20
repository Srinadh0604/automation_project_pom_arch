package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.ChallengingDomPage;
import herokuapp.utility.ConfigReader;



public class ChallengingDomTest extends BaseTest {

    @Test
    public void verifyButtonClickWorks() {

        ChallengingDomPage page = new ChallengingDomPage(driver);

        page.openChallengingDomPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("challengingDomUrl")
        );

        page.clickBlueButton();

        Assert.assertTrue(true, "Button clicked successfully");
    }
}

