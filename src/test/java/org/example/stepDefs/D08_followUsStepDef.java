package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D08_followUsStepDef {
    P03_HomePage home = new P03_HomePage();

    @When("user click on facebook icon")
    public void userClickOnFacebookIcon() {
        home.facebookIcon().click();
    }

    @Then("user should navigate to facebook page")
    public void userShouldNavigateToFacebookPage() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        home.twitterIcon().click();
    }

    @Then("user should navigate to twitter page")
    public void userShouldNavigateToTwitterPage() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
    }


    @When("user opens rss link")
    public void userOpensRssLink() {
        home.rssIcon().click();
    }

    @Then("user should navigate to rss page")
    public void userShouldNavigateToRssPage() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        home.youtubeIcon().click();
    }

    @Then("user should navigate to youtube page")
    public void userShouldNavigateToYoutubePage() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
    }
}
