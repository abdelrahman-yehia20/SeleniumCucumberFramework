package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D07_homeSlidersStepDef {

    P03_HomePage home = new P03_HomePage();

    @When("user click on the first slider")
    public void clickOnFirstSlider(){
        home.sliders("1").click();
    }

    @Then("user should be navigate to the first slider details page")
    public void userShouldBeNavigateToTheFirstSliderDetailsPage() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        Boolean check = wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/iphone-14-pro"));
        Assert.assertTrue(check);
    }

    @When("user click on the second slider")
    public void userClickOnTheSecondSlider() {
        home.sliders("2").click();
    }

    @Then("user should be navigated to the second slider details page")
    public void userShouldBeNavigatedToTheSecondSliderDetailsPage() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        Boolean check = wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/Galaxy-S22-Ultra"));
        Assert.assertTrue(check);
    }
}
