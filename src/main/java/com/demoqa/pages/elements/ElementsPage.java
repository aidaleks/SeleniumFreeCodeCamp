package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.forms.PracticeFormPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {
    private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");

    public WebTablePage clickWebTable(){
        scrollToElementJS(webTablesMenuItem);
        click(webTablesMenuItem);
        return new WebTablePage();
    }

    public LinksPage clickLinks(){
        scrollToElementJS(linksMenuItem);
        click(linksMenuItem);
        return new LinksPage();

    }
}
