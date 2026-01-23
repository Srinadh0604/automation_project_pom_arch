package herokuapp.dataprovider;


import org.testng.annotations.DataProvider;

public class TestDataProvider {

    // 🔹 For Dropdown tests
    @DataProvider(name = "dropdownData")
    public Object[][] getDropdownData() {
        return new Object[][] {
                { "Option 1" },
                { "Option 2" }
        };
    }

    // 🔹 For Inputs tests
    @DataProvider(name = "inputsData")
    public Object[][] getInputsData() {
        return new Object[][] {
                { "123" },
                { "-45" },
                { "999" }
        };
    }

    // 🔹 For AB Testing page load
    @DataProvider(name = "abTestingData")
    public Object[][] getABTestingData() {
        return new Object[][] {
                { "/abtest", "A/B" },
                { "/abtest", "Test" }
        };
    }

    // 🔹 For Status Codes
    @DataProvider(name = "statusCodeData")
    public Object[][] getStatusCodeData() {
        return new Object[][] {
                { "200", "200 status code" },
                { "301", "301 status code" }
        };
    }

   

 // 🔹 For Horizontal Slider
    @DataProvider(name = "sliderData")
    public Object[][] getSliderData() {
        return new Object[][] {
                { 40 },   // move small
                { 80 }    // move bigger
        };
    }


    // 🔹 Generic URL check provider (for simple load tests)
    @DataProvider(name = "pageLoadData")
    public Object[][] getPageLoadData() {
        return new Object[][] {
                { "/checkboxes", "Checkboxes" },
                { "/dropdown", "Dropdown" },
                { "/inputs", "Inputs" },
                { "/typos", "Sometimes" }
        };
    }
    
 // 🔹 For Checkboxes (select / unselect)
    @DataProvider(name = "checkboxData")
    public Object[][] getCheckboxData() {
        return new Object[][] {
                { 0 },   // first checkbox
                { 1 }    // second checkbox
        };
    }
    
 // 🔹 For Typos text validation
    @DataProvider(name = "typosData")
    public Object[][] getTyposData() {
        return new Object[][] {
                { "Sometimes" },
                { "won't" }
        };
    }

 
    @DataProvider(name = "actionData")
    public Object[][] getDynamicControlsData() {
        return new Object[][] {
                { true }  
        };
    }
    
 // 🔹 Notification Messages
    @DataProvider(name = "notificationData")
    public Object[][] getNotificationData() {
        return new Object[][] {
                { "Action" },
                { "successful" }
        };
    }
    
 // 🔹 Add / Remove Elements
    @DataProvider(name = "addRemoveData")
    public Object[][] getAddRemoveData() {
        return new Object[][] {
                { 1 },
                { 3 }
        };
    }
    
 // 🔹 Dynamic Loading
    @DataProvider(name = "dynamicLoadingData")
    public Object[][] getDynamicLoadingData() {
        return new Object[][] {
                { "Hello World!" }
        };
    }
    
 // 🔹 Hovers
    @DataProvider(name = "hoversData")
    public Object[][] getHoversData() {
        return new Object[][] {
                { "name: user1" }
        };
    }
    
    
 // 🔹 Redirect
    @DataProvider(name = "redirectData")
    public Object[][] getRedirectData() {
        return new Object[][] {
                { "status_codes" }
        };
    }
    
 // 🔹 JavaScript Alerts (Alert, Confirm, Prompt)
    @DataProvider(name = "jsAlertsData")
    public Object[][] getJavaScriptAlertsData() {
        return new Object[][] {
                { "alert", "You successfully clicked an alert" },
                { "confirm", "You clicked: Ok" },
                { "prompt", "You entered: Selenium" }
        };
    }
    
 // 🔹 Infinite Scroll (number of scrolls)
    @DataProvider(name = "scrollData")
    public Object[][] getScrollData() {
        return new Object[][] {
                { 1 },
                { 3 }
        };
    }
    
//🔹 For Multiple Windows
@DataProvider(name = "windowsData")
public Object[][] getWindowsData() {
 return new Object[][] {
         { "New Window" }
 };
}


}