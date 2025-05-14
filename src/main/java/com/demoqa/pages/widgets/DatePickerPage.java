package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;

public class DatePickerPage extends WidgetsPage {

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By selectDay(String day){
       return By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    public void clickSelectDate(){
        click(selectDateField);
    }

    public String getDate(){
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month){
        selectByVisibleText(monthDropDown, month);
    }

    public void selectYear(String year){
        selectByVisibleText(yearDropDown, year);
    }

    public void clickDay(String day){
        click(selectDay(day));
    }

    public boolean isDayInMonth(String day){
        return find(selectDay(day)).isDisplayed();
    }
}
