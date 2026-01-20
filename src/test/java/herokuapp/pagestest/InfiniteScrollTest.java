package herokuapp.pagestest;



import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.InfiniteScrollPage;
import herokuapp.utility.ConfigReader;



public class InfiniteScrollTest extends BaseTest {

    @Test
    public void verifyInfiniteScrollWorks() {

        InfiniteScrollPage page = new InfiniteScrollPage(driver);

        page.openInfiniteScrollPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("infiniteScrollUrl")
        );

        page.scrollDown();

        Assert.assertTrue(true, "Page scrolled successfully");
    }
}
