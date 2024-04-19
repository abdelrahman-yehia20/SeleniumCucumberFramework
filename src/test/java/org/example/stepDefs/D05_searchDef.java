package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_search;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class D05_searchDef {
    P05_search search = new P05_search();


    @When("user enter search result as {string}")
    public void userEnterSearchResultAs(String arg0) {
        search.searchField().sendKeys(arg0);
        search.searchField().sendKeys(Keys.ENTER);

    }

    /*
    @Then("The result should be displayed")
    public void result(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));

        int count = search.searchResult().size();
        for (int i=0; i<count;i++){
           String txt = search.searchResult().get(i).getText();
           soft.assertTrue(txt.contains("and"));

        }

        soft.assertAll();
    }

     */


    @Then("The result should be displayed {string}")
    public void theResultShouldBeDisplayed(String arg0) {

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));

        int count = search.searchResult().size();
        for (int i=0; i<count;i++){
            String txt = search.searchResult().get(i).getText().toLowerCase();
            System.out.println(txt);
            System.out.println("arg0: " + arg0);
            soft.assertTrue(txt.contains(arg0.toLowerCase()));
        }
        soft.assertAll();
    }


    @When("user enter search result as a{string}")
    public void userEnterSearchResultAsA(String arg0) {
        search.searchField().sendKeys(arg0);
        search.searchField().sendKeys(Keys.ENTER);
        Hooks.driver.findElement(By.cssSelector("div[class=\"picture\"] a")).click();

    }

    @Then("The result should be displayed a{string}")
    public void theResultShouldBeDisplayedA(String arg0) {

        SoftAssert soft = new SoftAssert();
        System.out.println("result "+search.sku().getText());
        soft.assertTrue(search.sku().getText().toLowerCase().contains(arg0.toLowerCase()));

        soft.assertAll();
    }
}
