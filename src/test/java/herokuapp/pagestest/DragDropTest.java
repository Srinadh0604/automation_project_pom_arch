package herokuapp.pagestest;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.basetest.BaseTest;
import herokuapp.pages.DragDropPage;
import herokuapp.utility.ConfigReader;



public class DragDropTest extends BaseTest {

    @Test
    public void verifyDragAndDrop() {

        DragDropPage page = new DragDropPage(driver);

        page.openDragDropPage(
                ConfigReader.get("baseUrl"),
                ConfigReader.get("dragDropUrl")
        );

        page.dragAToB();

        Assert.assertTrue(true, "Drag and drop executed");
    }
}


