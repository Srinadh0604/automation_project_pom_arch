package herokuapp.pagestest;



import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.AddRemoveElementsPage;
import herokuapp.utility.ConfigReader;

public class AddRemoveElementsTest extends BaseTest {

    @Test(dataProvider = "addRemoveData", dataProviderClass = TestDataProvider.class)
    public void verifyAddAndRemoveElements(int count) {

//        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    	driver.get(
    		    ConfigReader.get("baseUrl") +
    		    ConfigReader.get("addRemoveUrl")
    		);

        AddRemoveElementsPage page = new AddRemoveElementsPage(driver);
    
            page.clickAddElement(count);

        Assert.assertEquals(page.getDeleteButtonsCount(), count,
                "Incorrect number of delete buttons");

    }
}




