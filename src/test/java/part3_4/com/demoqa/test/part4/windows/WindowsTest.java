package part3_4.com.demoqa.test.part4.windows;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindowURL(){
       var windowsPage =  homePage.goToAlerts().clickBrowserWindowMenuItem();
       windowsPage.clickWindowButton();

    }
}
