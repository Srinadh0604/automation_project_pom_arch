package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.NotificationMessagesPage;
import herokuapp.utility.ConfigReader;



public class NotificationMessagesTest extends BaseTest {

    @Test(dataProvider = "notificationData", dataProviderClass = TestDataProvider.class)
    public void verifyNotificationMessageAppears(String expectedText) {

        NotificationMessagesPage page = new NotificationMessagesPage(driver);

        page.openNotificationPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("notificationUrl")
        );

        page.clickForNotification();

        Assert.assertTrue(
                page.isNotificationDisplayed().contains(expectedText),
                "Notification message not displayed"
        );
    }
}


