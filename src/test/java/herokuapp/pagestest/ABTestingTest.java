package herokuapp.pagestest;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.AbTestingClass;
import herokuapp.utility.ConfigReader;



public class ABTestingTest extends BaseTest {
	
	

	 @Test(dataProvider = "abTestingData", dataProviderClass = TestDataProvider.class)
	    public void verifyABTestingPageLoads(String path, String expectedText) {

	        AbTestingClass page = new AbTestingClass(driver);

	        page.openABTestingPage(
	                ConfigReader.get("baseUrl"),
	                path
	        );

	        Assert.assertTrue(
	        		 page.getPageSourceText().contains(expectedText),
	                "A/B Testing page did not load correctly"
	        );
	    }

}
