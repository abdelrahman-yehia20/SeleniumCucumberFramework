package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_RegisterPage register = new P01_RegisterPage();

    @Given("user go to register page")
    public void register_page()
    {
        register.registerBtn().click();
    }


    @When("select gender type")
    public void selectGenderType() {
        register.maleBtn().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        register.firstName().sendKeys(arg0);
        register.lastName().sendKeys(arg1);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        //WebElement dateOfBirthDay = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select drpDay = new Select(register.dateOfBirthDrp());
        drpDay.selectByValue("14");

        Select drpMonth = new Select(register.dateOfBirthMonthDrp());
        drpMonth.selectByValue("3");

        Select drpYear = new Select(register.dateOfBirthYearDrp());
        drpYear.selectByValue("1990");



    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {
        register.email().sendKeys(arg0);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        register.password().sendKeys(arg0);
        register.confPassword().sendKeys(arg1);

    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.registerBtnInRegisterPage().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();

        String actualSuccessMessage = register.sucessMsgRegiser().getText();
        String color = register.sucessMsgRegiser().getCssValue("color");
        soft.assertTrue(register.sucessMsgRegiser().isDisplayed());
        soft.assertTrue(actualSuccessMessage.contains("Your registration completed"));
        soft.assertEquals(color,"rgba(76, 177, 124, 1)");


        soft.assertAll();

    }
}
