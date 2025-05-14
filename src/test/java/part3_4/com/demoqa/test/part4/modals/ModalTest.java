package part3_4.com.demoqa.test.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog(){
        var afwPage = homePage.goToAlerts();
        var modalDialogPage = afwPage.goToModalDialogPage();
        modalDialogPage.clickSmallModalButton();
        String actualText = modalDialogPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"),
                "\n The message does not contains small modal\n");
        modalDialogPage.clickCloseButton();
    }
}
