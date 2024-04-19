package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class P02_login {



    public WebElement loginHomeButton()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }


    public void addEmail(String mail){
         Hooks.driver.findElement(By.id("Email")).sendKeys(mail);
    }

    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password()

    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public WebElement logoutBtn(){
        return Hooks.driver.findElement(By.className("ico-logout"));
    }

    public WebElement unSuccessfulMsg(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }

}
