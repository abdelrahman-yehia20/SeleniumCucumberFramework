package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_RegisterPage {

    public WebElement registerBtn()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }


    public WebElement maleBtn()
    {
        return Hooks.driver.findElement(By.id("gender-male"));
    }

    public WebElement femaleBtn()
    {
        return Hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement firstName()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement dateOfBirthDrp()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement dateOfBirthMonthDrp()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement dateOfBirthYearDrp()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email()
    {
        return Hooks.driver.findElement(By.name("Email"));
    }

    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confPassword()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerBtnInRegisterPage()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    // successPage
    public WebElement sucessMsgRegiser()
    {
        return Hooks.driver.findElement(By.className("result"));
    }






}
