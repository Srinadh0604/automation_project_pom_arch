package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.HorizontalSliderPage;
import herokuapp.utility.ConfigReader;


public class HorizontalSliderTest extends BaseTest {

    @Test
    public void verifySliderMoves() {

        HorizontalSliderPage page = new HorizontalSliderPage(driver);

        page.openSliderPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("horizontalSliderUrl")
        );

        String before = page.getSliderValue();
        page.moveSliderRight();
        String after = page.getSliderValue();

        Assert.assertNotEquals(
                before,
                after,
                "Slider value did not change"
        );
    }
}

