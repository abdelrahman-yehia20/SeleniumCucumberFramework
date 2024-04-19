package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.beans.Visibility;
import java.time.Duration;

public class D09_WishlistStepDef {

    P03_HomePage home = new P03_HomePage();

    @When("user click on love icon")
    public void userClickOnLovIcon(){
        //home.loveIconList().get(2).click();
        Hooks.driver.findElements(By.xpath("//div[@class=\"buttons\"]/button[3]")).get(2).click();
    }


    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        String successMsg = home.SuccessWishlistTxt().getText();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(home.SuccessWishlistTxt()));
        Assert.assertEquals(home.SuccessWishlistTxt().getText(),"The product has been added to your wishlist");
    }
}
