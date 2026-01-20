package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.NotificationMessagesPage;
import herokuapp.utility.ConfigReader;



public class NotificationMessagesTest extends BaseTest {

    @Test
    public void verifyNotificationMessageAppears() {

        NotificationMessagesPage page = new NotificationMessagesPage(driver);

        page.openNotificationPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("notificationUrl")
        );

        page.clickForNotification();

        Assert.assertTrue(
                page.isNotificationDisplayed(),
                "Notification message not displayed"
        );
    }
}


