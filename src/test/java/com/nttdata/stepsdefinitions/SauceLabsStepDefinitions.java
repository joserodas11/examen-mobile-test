package com.nttdata.stepsdefinitions;

import com.nttdata.screens.HomeScreen;
import com.nttdata.screens.LoginScreen;
import com.nttdata.steps.SauceLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SauceLabsStepDefinitions {
    @Steps
    SauceLabsSteps sauceLabsSteps;
    @Given("User is on login screen")
    public void user_is_on_login_screen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User writes its {string} and {string} to log in")
    public void user_writes_its_and_to_log_in(String username, String password) {
        sauceLabsSteps.setLoginScreen(username,password);
    }
    @Then("User validates title PRODUCTS is displayed")
    public void user_validates_title_products_is_displayed() {
        Assert.assertEquals("PRODUCTS",sauceLabsSteps.getHomeScreenTitle());
    }
    @And("User validates that one item exists")
    public void user_validates_that_one_item_exists() {
        Assert.assertEquals("1",sauceLabsSteps.getnumberItemCart());
    }
}
