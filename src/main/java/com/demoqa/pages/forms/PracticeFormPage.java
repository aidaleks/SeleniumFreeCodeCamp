package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {
    private By femaleRadiobutton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private By submitButton = By.id("submit");

    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadiobutton);
        clickJS(femaleRadiobutton);
    }

    public boolean isFemaleSelected(){
        return find(femaleRadiobutton).isSelected();
    }

    public boolean isCheckboxHobbyChecked(){
        return find(sportsHobbyCheckbox).isSelected();
    }

    public void checkSportsHobbyCheckbox(){
        scrollToElementJS(sportsHobbyCheckbox);
        if (!isCheckboxHobbyChecked()) {
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void checkReadingCheckbox() {
        scrollToElementJS(readingHobbyCheckbox);
        if (!find(readingHobbyCheckbox).isSelected()) {
            clickJS(readingHobbyCheckbox);
        }
    }

    public void uncheckReadingCheckbox() {
        scrollToElementJS(readingHobbyCheckbox);
        if (find(readingHobbyCheckbox).isSelected()) {
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingCheckboxChecked(){
        return find(readingHobbyCheckbox).isSelected();
    }

    public void clickSubmitButton(){
        click(submitButton);
    }


}
