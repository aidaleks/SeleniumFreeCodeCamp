package part2.com.soursDemo.test.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.soursDemo.base.BaseTest;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("3434");
        loginPage.clickOnLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
