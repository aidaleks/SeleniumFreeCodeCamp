package part3_4.com.demoqa.test.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class TestFrames extends BaseTest {


    @Test
    public void testFramesBigBox(){
        var framesPage = homePage.goToAlerts().clickFramesMenuItem();
        String actualBigBoxText = framesPage.getTextFromBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText,
                "\n Actual & Expected messages are not equal \n ");
        String actualHeaderText = framesPage.getFramesHeaderText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,
                "\n Actual & Expected headers are not equal \n ");

    }

@Test
    public void testFramesSmallBox(){
    var framesPage = homePage.goToAlerts().clickFramesMenuItem();
    String actualSmallBoxText = framesPage.getTextFromSmallFrame();
    String expectedSmallBoxText = "This is a sample page";
    Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText,
            "\n Actual & Expected messages are not equal \n ");
    String actualHeaderText = framesPage.getFramesHeaderText();
    String expectedHeaderText = "Frames";
    Assert.assertEquals(actualHeaderText, expectedHeaderText,
            "\n Actual & Expected headers are not equal \n ");

}

}
