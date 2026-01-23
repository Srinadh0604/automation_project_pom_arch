package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.ChallengingDomPage;
import herokuapp.utility.ConfigReader;



public class ChallengingDomTest extends BaseTest {

    @Test(dataProvider = "domData", dataProviderClass = TestDataProvider.class)
    public void verifyButtonClickWorks(boolean click) {

        ChallengingDomPage page = new ChallengingDomPage(driver);

        page.openChallengingDomPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("challengingDomUrl")
        );

        page.clickBlueButton();

        Assert.assertTrue(click, "Button clicked successfully");
    }
}

