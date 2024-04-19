package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

import javax.sound.sampled.SourceDataLine;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    
    @Given("user go to login page")
    public void goToLoginPage(){
        login.loginHomeButton().click();
    }

    @When("user login with {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1) {
        login.email().sendKeys(arg0);
        login.password().sendKeys(arg1);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {

        SoftAssert soft = new SoftAssert();
        String actualURL = Hooks.driver.getCurrentUrl();
        soft.assertTrue(login.logoutBtn().isDisplayed());
        soft.assertEquals(actualURL,"https://demo.nopcommerce.com/");
        soft.assertAll();
    }


    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();
        String color = login.unSuccessfulMsg().getCssValue("color");
        soft.assertTrue(login.unSuccessfulMsg().getText().contains("Login was unsuccessful"));
        soft.assertEquals(color,"rgba(228, 67, 75, 1)");
        soft.assertAll();

    }
}
