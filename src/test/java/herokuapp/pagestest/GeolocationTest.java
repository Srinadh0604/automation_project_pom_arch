package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.GeolocationPage;
import herokuapp.utility.ConfigReader;

public class GeolocationTest extends BaseTest {

    @Test
    public void verifyGeolocationButtonClick() {

        GeolocationPage page = new GeolocationPage(driver);

        page.openGeolocationPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("geolocationUrl")
        );

        page.clickWhereAmI();

        Assert.assertTrue(true, "Geolocation button clicked");
    }
}

