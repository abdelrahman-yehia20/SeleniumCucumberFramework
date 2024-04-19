package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_search {
    public WebElement searchField(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public List<WebElement> searchResult(){
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));
    }

    public WebElement sku()
    {
        return Hooks.driver.findElement(By.xpath("//div/span[@class=\"value\"][@id]"));
    }
}
