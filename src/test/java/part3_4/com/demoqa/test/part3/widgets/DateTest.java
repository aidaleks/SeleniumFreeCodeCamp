package part3_4.com.demoqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {


    @Test
    public void testSelectingDate(){
        String year = "2024";
        String month = "December";
        String monthNumber = "12";
        String day = "14";

        var datPickerPage = homePage.goToWidgets().clickDatePickerMenu();
        datPickerPage.clickSelectDate();
        datPickerPage.selectYear(year);
        datPickerPage.selectMonth(month);
        datPickerPage.clickDay(day);

        String actualDate = datPickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate, "\n Date is not correct \n " +
                "\n Actual date is   " + actualDate +
                "\n Expected date is " + expectedDate);


    }
}
