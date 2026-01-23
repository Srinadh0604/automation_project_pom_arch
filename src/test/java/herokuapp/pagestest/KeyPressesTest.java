package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.KeyPressesPage;
import herokuapp.utility.ConfigReader;


public class KeyPressesTest extends BaseTest {

    @Test
    public void verifyKeyPressDetected() {

        KeyPressesPage page = new KeyPressesPage(driver);

        page.openKeyPressesPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("keyPressesUrl")
        );

        page.pressEnterKey();

        Assert.assertTrue(
                page.isEnterDetected(),
                "Key press was not detected"
        );
    }
}

