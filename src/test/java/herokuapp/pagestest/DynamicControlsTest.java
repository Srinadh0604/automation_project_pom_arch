package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.DynamicControlsPage;
import herokuapp.utility.ConfigReader;
import herokuapp.utility.WaitUtils;

public class DynamicControlsTest extends BaseTest {

    @Test(dataProvider = "actionData", 
            dataProviderClass = TestDataProvider.class)
    public void verifyTextboxGetsEnabled(boolean enable) {

        DynamicControlsPage page = new DynamicControlsPage(driver);

        page.openDynamicControlsPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("dynamicControlsUrl")
        );

        page.clickEnableButton();

        WaitUtils.waitForElementClickable(driver,
        		page.getInputLocator());

        Assert.assertTrue(
                page.isInputEnabled(),
                "Textbox was not enabled"
        );
    }
}


