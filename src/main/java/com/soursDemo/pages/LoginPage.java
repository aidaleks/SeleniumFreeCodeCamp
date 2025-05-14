package com.soursDemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMassage = By.cssSelector("#login_button_container h3");


    public void setUsername(String username){
        set(usernameField, username);
    }

    public void setPassword(String password){
        set(passwordField, password);
    }

    public ProductsPage clickOnLoginButton(){
        click(loginButton);
        return new ProductsPage();
    }

    public ProductsPage loginIntoApplication(String username, String password){
        setUsername(username);
        setPassword(password);
        return clickOnLoginButton();
    }

    public String getErrorMessage(){
        return find(errorMassage).getText();
    }

}
