package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernameField;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;


    public void enterUserName(String username) {
        Reporter.log("Enter Username" + username.toString());
        sendTextToElement(usernameField, username);
        CustomListeners.test.log(Status.PASS,"Enter usernameField " + username);


    }
        public void enterPassword (String password){
            Reporter.log("Enter PasswordField " + password.toString());
            sendTextToElement(passwordField, password);
            CustomListeners.test.log(Status.PASS,"Enter PasswordField " + password);
        }
        public void clickOnLoginButton () {
            Reporter.log("Clicking on Login Button" + loginButton.toString());
            clickOnElement(loginButton);
            CustomListeners.test.log(Status.PASS," click on loginButton " );
        }

    }
