package part3_4.com.demoqa.test.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwithchToUtility.*;

@Test
public class TestAlerts extends BaseTest {


    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlerts().clickAlertsMenuItem();
        alertsPage.clickInformationAlertButton();
        String actualAlertText = getAlertText();
        Assert.assertEquals(actualAlertText, expectedAlertText,
                "\n Actual & Expected messages are not equal\n");
        acceptAlert();

    }

    public void testConfirmationAlert(){
        String expectedConfirmationMessage = "You selected Cancel";

        var alertsPage = homePage.goToAlerts().clickAlertsMenuItem();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationMessage = alertsPage.getConfirmationResult();
        Assert.assertEquals(actualConfirmationMessage, expectedConfirmationMessage,
                "\n you did not select Cancel\n");

    }

    public void testPromptAlert(){
        String alertText = "Selenium With Java";
        String expectedPromptMessage = "You entered " + alertText;

        var alertsPage = homePage.goToAlerts().clickAlertsMenuItem();
        alertsPage.clickPromtAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualPromptMessage = alertsPage.getPromtAlertResult();
        Assert.assertEquals(actualPromptMessage, expectedPromptMessage,
                "\n Actual & Expected messages are not equal\n");

    }
}
