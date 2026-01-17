package pagestest;



import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;

import pages.AddRemoveElementsPage;
import utility.ConfigReader;

public class AddRemoveElementsTest extends BaseTest {

    @Test
    public void verifyAddAndRemoveElements() {

//        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    	driver.get(
    		    ConfigReader.get("baseUrl") +
    		    ConfigReader.get("addRemoveUrl")
    		);

        AddRemoveElementsPage page = new AddRemoveElementsPage(driver);

        // Add 5 elements
        for (int i = 0; i < 5; i++) {
            page.clickAddElement();
        }

        Assert.assertEquals(page.getDeleteButtonsCount(), 5,
                "Delete buttons count mismatch");

        // Remove one element
        page.deleteOneElement();

        Assert.assertEquals(page.getDeleteButtonsCount(), 4,
                "Delete button not removed properly");
    }
}




