package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_ForgetPassword;
import org.testng.asserts.SoftAssert;

public class D03_forgetPasswordDef {
    P03_ForgetPassword forget = new P03_ForgetPassword();

    @Given("User go to forget password page")
    public void UserGoToForgetPage()
    {
        Hooks.driver.get("https://demo.nopcommerce.com/passwordrecovery");
    }

    @When("User enter email {string}")
    public void userEnterEmail(String arg0) {
        forget.email().sendKeys(arg0);

    }

    @And("user click on recover button")
    public void userClickOnRecoverButton() {
        forget.recoverBtn().click();

    }

    @Then("Success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(forget.successMsg().isDisplayed());
        String color = forget.successMsg().getCssValue("color");
        System.out.println(color);
        soft.assertEquals(color,"rgba(255, 255, 255, 1)");
        soft.assertAll();


    }

    @Then("Error message is displayed")
    public void errorMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(forget.errorMsg().isDisplayed());
        String color = forget.successMsg().getCssValue("color");
        System.out.println(color);
        soft.assertEquals(color,"rgba(255, 255, 255, 1)");
        soft.assertAll();

    }
}
