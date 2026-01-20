package herokuapp.pagestest;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.ContextMenuPage;
import herokuapp.utility.ConfigReader;




public class ContextMenuTest extends BaseTest {

    @Test
    public void verifyRightClickShowsAlert() {

        ContextMenuPage page = new ContextMenuPage(driver);

        page.openContextMenuPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("contextMenuUrl")
        );

        page.rightClickOnBox();

        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(
                alert.getText().contains("You selected"),
                "Context menu alert not displayed"
        );
        alert.accept();
    }
}

