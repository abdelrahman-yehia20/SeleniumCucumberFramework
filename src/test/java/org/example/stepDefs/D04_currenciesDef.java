package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_currencies;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_currenciesDef {
    P04_currencies currency = new P04_currencies();
    
    @When("user select euro from drp")
    public void selectEuroFromDrp()
    {
        Select select = new Select(currency.currencyDrp());
        select.selectByVisibleText("Euro");


    }

    @Then("All products price should be displayed with euro")
    public void allProductsPriceShouldBeDisplayedWithEuro() {
        int count = currency.pricesList().size();

        for (int i=0; i <count ;i++)
        {
            String text= currency.pricesList().get(i).getText();
            SoftAssert soft = new SoftAssert();
            soft.assertTrue(text.contains("€"));
            System.out.println(text);
            soft.assertAll();

        }
    }
}
