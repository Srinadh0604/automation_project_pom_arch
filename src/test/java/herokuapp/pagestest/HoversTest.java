package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.HoversPage;
import herokuapp.utility.ConfigReader;

public class HoversTest extends BaseTest {

    @Test(dataProvider = "hoversData", dataProviderClass = TestDataProvider.class)
    public void verifyHoverDisplaysCaption(String expectedText) {

        HoversPage page = new HoversPage(driver);

        page.openHoversPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("hoversUrl")
        );

        page.hoverOnFirstImage();

        Assert.assertTrue(
        		page.getPageSource().contains(expectedText),
                "Hover caption not displayed"
        );
    }
}

