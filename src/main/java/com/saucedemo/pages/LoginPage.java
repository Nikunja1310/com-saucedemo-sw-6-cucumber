package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created By Nikunja A Senjalia
 */
public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productsText;


    public void enterUserName(String username) {
        sendTextToElement(usernameField, username);
        log.info("Enter Username : " + username + " to username field " + usernameField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password : " + password + " to password field " + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on Login button " + loginButton.toString());
    }


    public String getProductText() {
        log.info("Getting text of product " + productsText);
        return getTextFromElement(productsText);
    }

    /*public String getErrorMessage() {
        log.info("Getting Erro message" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }*/
}
