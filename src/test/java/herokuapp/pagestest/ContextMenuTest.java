package herokuapp.pagestest;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.ContextMenuPage;
import herokuapp.utility.ConfigReader;




public class ContextMenuTest extends BaseTest {

    @Test(dataProvider = "contextMenuData", dataProviderClass = TestDataProvider.class)
    public void verifyRightClickShowsAlert(boolean run) {

        ContextMenuPage page = new ContextMenuPage(driver);

        page.openContextMenuPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("contextMenuUrl")
        );

        page.rightClickOnBox();

        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertTrue(
        		alertText.contains("You selected"),
                "Context menu alert not displayed"
        );
        
    }
}

