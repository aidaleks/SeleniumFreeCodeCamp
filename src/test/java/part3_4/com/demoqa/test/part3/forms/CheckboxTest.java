package part3_4.com.demoqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.checkReadingCheckbox();
        formsPage.checkSportsHobbyCheckbox();
        formsPage.uncheckReadingCheckbox();
        boolean isSportsCheckboxIsSelected = formsPage.isCheckboxHobbyChecked();
        Assert.assertTrue(isSportsCheckboxIsSelected, "\n Sports checkbox is not selected \n");
        boolean isReadingCheckboxUnchecked = formsPage.isReadingCheckboxChecked();
        Assert.assertFalse(isReadingCheckboxUnchecked, "\n Reading checkbox is unchecked \n");
    }
}
