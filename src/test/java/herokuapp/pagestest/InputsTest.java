package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.InputsPage;
import herokuapp.utility.ConfigReader;



public class InputsTest extends BaseTest {

    @Test(dataProvider = "inputsData", dataProviderClass = TestDataProvider.class)
    public void verifyInputAcceptsNumber(String value) {
    	
        InputsPage page = new InputsPage(driver);
       
        page.openInputsPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("inputsUrl")
        );
        
        page.enterValue(value);

        Assert.assertEquals(page.getEnteredValue(), "123",
                "Input did not accept number");
    }
}


