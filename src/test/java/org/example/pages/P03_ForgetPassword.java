package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class P03_ForgetPassword {

    public WebElement email(){
        return Hooks.driver.findElement(By.id("Email"));
   }

   public WebElement recoverBtn()
   {
       return Hooks.driver.findElement(By.name("send-email"));
   }

   public WebElement successMsg()
   {
       return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
   }

    public WebElement errorMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
}
