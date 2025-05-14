package part3_4.com.demoqa.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks() throws InterruptedException {
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();
        Thread.sleep(1000);
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "\n actual Response ( " + actualResponse + ") Does not contains 400 error \n");
    }
}
