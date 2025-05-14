package com.demoqa.pages.alerts;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFramsWindowsPage {

    private By informationAlertButton = By.id("alertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResult = By.id("confirmResult");
    private By promtAlertButton = By.id("promtButton");
    private By promtAlertResult = By.id("promptResult");

    public String getPromtAlertResult(){
        return find(promtAlertResult).getText();
    }

    public void clickPromtAlertButton(){
        click(promtAlertButton);
    }

    public void clickInformationAlertButton(){
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton(){
        click(confirmationAlertButton);
    }

    public String getConfirmationResult(){
        return find(confirmationResult).getText();
    }

}
