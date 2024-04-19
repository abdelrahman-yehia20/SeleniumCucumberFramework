package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_HomePage {




    public List<WebElement> mainCategory()
    {
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a"));
    }

    public List<WebElement> subCategory(String num)
    {
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+num+"]/ul/li"));
    }


    public WebElement sliders(String num) { return Hooks.driver.findElement(By.cssSelector("a[class=nivo-imageLink]:nth-child("+num+")"));}

    public WebElement facebookIcon()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"facebook\"] a"));
    }

    public WebElement twitterIcon()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"twitter\"] a"));
    }

    public WebElement rssIcon()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"rss\"] a"));
    }
    public WebElement youtubeIcon()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"youtube\"] a"));
    }

    public List<WebElement> loveIconList() {
        return Hooks.driver.findElements(By.xpath("//div[@class=\"buttons\"]/button[3]"));
    }

    public WebElement SuccessWishlistTxt(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }



}
