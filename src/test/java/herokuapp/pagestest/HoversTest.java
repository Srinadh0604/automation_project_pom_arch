package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.HoversPage;
import herokuapp.utility.ConfigReader;

public class HoversTest extends BaseTest {

    @Test
    public void verifyHoverDisplaysCaption() {

        HoversPage page = new HoversPage(driver);

        page.openHoversPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("hoversUrl")
        );

        page.hoverOnFirstImage();

        Assert.assertTrue(
                page.isCaptionVisible(),
                "Hover caption not displayed"
        );
    }
}

