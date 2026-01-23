package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.dataprovider.TestDataProvider;
import herokuapp.pages.DragDropPage;
import herokuapp.utility.ConfigReader;



public class DragDropTest extends BaseTest {

    @Test(dataProvider = "dragDropData", dataProviderClass = TestDataProvider.class)
    public void verifyDragAndDrop(boolean run) {

        DragDropPage page = new DragDropPage(driver);

        page.openDragDropPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("dragDropUrl")
        );

        page.dragAToB();

        Assert.assertTrue(run, "Drag and drop executed");
    }
}


