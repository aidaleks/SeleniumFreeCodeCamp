package com.demoqa.pages.alerts;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.SwithchToUtility.*;

public class FramesPage extends AlertsFramsWindowsPage {

    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='framesWrapper']/h1[text()='Frames']");


    public String getFramesHeaderText(){
        return find(headerFramesText).getText();
    }

    private void switchToBigFrame(){
        //driver.switchTo().frame(iFrameBigBox);
        // Use method from SwitchToUtility
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallFrame(){
        switchToFrameIndex(3);
    }

    public String getTextFromBigFrame(){
        switchToBigFrame();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big frame text is " + bigFrameText);
        //Use method from SwitchToUtility
        switchToDefaultContent();
        //driver.switchTo().parentFrame();
        return bigFrameText;
    }

    public String getTextFromSmallFrame(){
        switchToSmallFrame();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small frame text is " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
