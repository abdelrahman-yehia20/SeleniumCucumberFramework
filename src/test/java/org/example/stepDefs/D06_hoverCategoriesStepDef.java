package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.interactions.Actions;


import java.util.Random;

public class D06_hoverCategoriesStepDef {

    P03_HomePage home = new P03_HomePage();
    int count = home.mainCategory().size();




    @When("user hover on category and click on it")
            public void userHoverOnCategoryAndClickOnIt(){
        int randomNumberMain = new Random().nextInt(count);
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(home.mainCategory().get(randomNumberMain)).perform();
        String randomNubString = String.valueOf(randomNumberMain+1);

        if(home.subCategory(randomNubString).size()==0)
        {
            home.mainCategory().get(randomNumberMain).click();
            String txt = home.mainCategory().get(randomNumberMain).getText();
            System.out.println(txt);
        }

        else
        {
            int randomSub = new Random().nextInt(3);
            home.subCategory(randomNubString).get(randomSub).click();
            String txtsub = home.subCategory(randomNubString).get(randomSub).getText();
            System.out.println(txtsub);
        }


    }


    @Then("user is navigate to details page")
    public void userIsNavigateToDetailsPage() {


    }
}
