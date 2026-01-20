package herokuapp.pagestest;


import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.AbTestingClass;
import herokuapp.utility.ConfigReader;



public class ABTestingTest extends BaseTest {

	 @Test
	    public void verifyABTestingPageLoads() {

	        AbTestingClass page = new AbTestingClass(driver);

	        page.openABTestingPage(
	                ConfigReader.get("baseUrl"),
	                ConfigReader.get("abTestingUrl")
	        );

	        Assert.assertTrue(
	                page.isABTestTextPresent(),
	                "A/B Testing page did not load correctly"
	        );
	    }

}
