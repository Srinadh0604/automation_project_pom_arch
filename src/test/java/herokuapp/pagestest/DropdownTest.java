package herokuapp.pagestest;



import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.DropdownPage;
import herokuapp.utility.ConfigReader;


public class DropdownTest extends BaseTest {

    @Test
    public void verifyDropdownSelection() {

        

        driver.get(
            ConfigReader.get("baseUrl") +
            ConfigReader.get("dropdownUrl")
        );
        

        DropdownPage page = new DropdownPage(driver);

        // Initial state
        String defaultOption = page.getSelectedOption();
        System.out.println("Default selected option: " + defaultOption);

        Assert.assertEquals(defaultOption, "Please select an option",
                "Default dropdown option is incorrect");

        // Select Option 1
        page.selectOptionByVisibleText("Option 1");
        System.out.println("Selected Option 1");

        Assert.assertEquals(page.getSelectedOption(), "Option 1",
                "Option 1 is not selected");

        // Select Option 2
        page.selectOptionByVisibleText("Option 2");
        System.out.println("Selected Option 2");

        Assert.assertEquals(page.getSelectedOption(), "Option 2",
                "Option 2 is not selected");

    
    }
}


