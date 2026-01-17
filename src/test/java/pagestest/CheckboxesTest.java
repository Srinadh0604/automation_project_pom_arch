package pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.CheckboxesPage;
import utility.ConfigReader;


public class CheckboxesTest extends BaseTest {

    @Test
    public void verifyCheckboxSelectionBehavior() {

        driver.get(
            ConfigReader.get("baseUrl") +
            ConfigReader.get("checkboxesUrl")
        );

        CheckboxesPage page = new CheckboxesPage(driver);

        // Initial state verification
        Assert.assertFalse(page.isFirstCheckboxSelected(),
                "First checkbox should be unchecked initially");
        System.out.println(" First checkbox is unchecked initially");

        Assert.assertTrue(page.isSecondCheckboxSelected(),
                "Second checkbox should be checked initially");
        System.out.println(" Second checkbox is checked initially");

        // Perform actions
        page.selectFirstCheckbox();
        System.out.println(" First checkbox selected");
        page.unselectSecondCheckbox();
        System.out.println(" Second checkbox unselected");

        // Final state verification
        Assert.assertTrue(page.isFirstCheckboxSelected(),
                "First checkbox should be checked after selection");

        Assert.assertFalse(page.isSecondCheckboxSelected(),
                "Second checkbox should be unchecked after unselecting");
    }
}



