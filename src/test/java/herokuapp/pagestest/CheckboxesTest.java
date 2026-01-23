package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.CheckboxesPage;
import herokuapp.utility.ConfigReader;


public class CheckboxesTest extends BaseTest {

    @Test(dataProvider = "checkboxData", dataProviderClass = TestDataProvider.class)
    public void verifyCheckboxSelectionBehavior(int index) {

        driver.get(
            ConfigReader.get("baseUrl") +
            ConfigReader.get("checkboxesUrl")
        );

        CheckboxesPage page = new CheckboxesPage(driver);
    
        // Click checkbox based on DataProvider index
        page.clickCheckbox(index);

        // Validate checkbox is selected
        Assert.assertTrue(
                page.isCheckboxSelected(index),
                "Checkbox at index " + index + " was not selected"
        );
    }
}



