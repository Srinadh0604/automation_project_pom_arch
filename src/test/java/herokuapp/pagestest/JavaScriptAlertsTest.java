package herokuapp.pagestest;



import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.JavaScriptAlertsPage;
import herokuapp.utility.ConfigReader;


public class JavaScriptAlertsTest extends BaseTest {

	@Test(dataProvider = "jsAlertsData", dataProviderClass = TestDataProvider.class)
    public void verifyJavaScriptAlerts(String type, String expectedResult) {

		JavaScriptAlertsPage page = new JavaScriptAlertsPage(driver);
		
    	  page.openPage(
                  ConfigReader.get("baseUrl"),
                  ConfigReader.get("alertsUrl")
          );
    	  
        System.out.println("Navigated to JavaScript Alerts page");
 
     // Click respective alert button
        page.clickAlert(type);

        Alert  alert = driver.switchTo().alert();
        
        // Handle prompt separately
        if (type.equalsIgnoreCase("prompt")) {
            alert.sendKeys("Selenium");
        }

        alert.accept();

        Assert.assertTrue(driver.getPageSource().contains(expectedResult),
        		"Alert handling failed for type: " + type);

        System.out.println("JavaScript Alerts Test Completed Successfully ");
    }
}

