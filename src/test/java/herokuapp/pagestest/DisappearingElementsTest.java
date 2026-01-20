package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.DisappearingElementsPage;
import herokuapp.utility.ConfigReader;



public class DisappearingElementsTest extends BaseTest {

    @Test
    public void verifyMenuItemsDisplayed() {

        DisappearingElementsPage page = new DisappearingElementsPage(driver);

        page.openDisappearingElementsPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("disappearingElementsUrl")
        );

        Assert.assertTrue(
                page.getMenuItems().size() > 0,
                "Menu items not displayed"
        );
    }
}


