package com.demoqa.pages.alerts;

import org.openqa.selenium.By;

import java.util.Set;

public class BrowserWindowPage extends AlertsFramsWindowsPage {

    private By newWindowButton = By.id("windowButton");

    public void clickWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        // Step 1: Get the current "Main" window Handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main window ID " + currentHandle + "\n");


        // Step 2: Get All window handles
        Set<String> allHandlers = driver.getWindowHandles();
        System.out.println("# of Opened windows" + allHandlers.size());

        // Step 3: Switch to the new window using the window handle


    }

}
