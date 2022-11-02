package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class HomeScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement title;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]")
    private WebElement addToCartButton;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement numberItem;
    public String getTitle(){
        return title.getText();
    }
    public String getNumberItem(){
        addToCartButton.click();
        return numberItem.getText();
    }
}
