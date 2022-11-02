package com.nttdata.steps;

import com.nttdata.screens.HomeScreen;
import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;

public class SauceLabsSteps {
    LoginScreen loginScreen;
    HomeScreen homeScreen;

    @Step("Ingrsar al sistema {String} {String}")
    public void setLoginScreen(String username, String password) {
        loginScreen.logIn(username, password);
    }
    @Step("Obtener titulo")
    public String getHomeScreenTitle(){
        return homeScreen.getTitle();
    }
    @Step("Obtener numero de item del carrito")
    public String getnumberItemCart(){
        return homeScreen.getNumberItem();
    }
}
