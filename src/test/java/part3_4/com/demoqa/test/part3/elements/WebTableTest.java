package part3_4.com.demoqa.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable(){
        String email = "alden@example.com";
        String age = "34";
        var webTablesPage = homePage.goToElements().clickWebTable();
        webTablesPage.clickEdit(email);
        webTablesPage.setAge(age);
        webTablesPage.clickSubmit();
        String actualAge = webTablesPage.getTableAge(email);
        //String expectedAge = age;
        Assert.assertEquals(actualAge,age, "\n Actual & Expected ages do not match \n");
    }
}
