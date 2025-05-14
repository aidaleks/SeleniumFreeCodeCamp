package com.demoqa.pages.alerts;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsFramsWindowsPage extends HomePage {

    private By modalDialogMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
    private By framesMenuItem = By.xpath("//li[@id='item-2']//span[text()='Frames']");
    private By browserWindowMenuItem = By.xpath("//li[@id='item-0']//span[text()='Browser Windows']");

    public BrowserWindowPage clickBrowserWindowMenuItem(){
        scrollToElementJS(browserWindowMenuItem);
        click(browserWindowMenuItem);
        return new BrowserWindowPage();
    }

    public FramesPage clickFramesMenuItem(){
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }

    public ModalDialogPage goToModalDialogPage(){
        scrollToElementJS(modalDialogMenuItem);
        click(modalDialogMenuItem);
        return new ModalDialogPage();
    }

    public AlertsPage clickAlertsMenuItem(){
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }
}
