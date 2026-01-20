package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.DynamicControlsPage;
import herokuapp.utility.ConfigReader;
import herokuapp.utility.WaitUtils;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void verifyTextboxGetsEnabled() {

        DynamicControlsPage page = new DynamicControlsPage(driver);

        page.openDynamicControlsPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("dynamicControlsUrl")
        );

        page.clickEnableButton();

        WaitUtils.waitForElementClickable(driver,
                org.openqa.selenium.By.cssSelector("input[type='text']"));

        Assert.assertTrue(
                page.isInputEnabled(),
                "Textbox was not enabled"
        );
    }
}


