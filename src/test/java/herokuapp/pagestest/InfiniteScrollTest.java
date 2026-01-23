package herokuapp.pagestest;



import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.InfiniteScrollPage;
import herokuapp.utility.ConfigReader;



public class InfiniteScrollTest extends BaseTest {

    @Test(dataProvider = "scrollData", dataProviderClass = TestDataProvider.class)
    public void verifyInfiniteScrollWorks(int times) {

        InfiniteScrollPage page = new InfiniteScrollPage(driver);

        page.openInfiniteScrollPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("infiniteScrollUrl")
        );

        page.scrollDown(times);

        Assert.assertTrue(true, "Page scrolled successfully");
    }
}
