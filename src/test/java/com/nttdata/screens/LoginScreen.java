package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement userInput;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement passwordInput;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement loginButton;

    public void logIn(String username, String password){
        userInput.click();
        userInput.sendKeys(username);
        passwordInput.click();
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
