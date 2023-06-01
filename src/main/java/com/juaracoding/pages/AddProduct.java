package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddProduct {
    private static WebDriver driver;
    public AddProduct(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

        driver.findElement(By.xpath("//span[contains(text(),'ToolsQA Demo Site')]")).click();
        scroll(1000);
        driver.findElement(By.xpath("//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")).click();
        scroll(700);
        WebElement selectColor = driver.findElement(By.id("pa_color"));
        Select select = new Select(selectColor);
        select.selectByVisibleText("Grey");
        System.out.println("Select Dropdown Color");
        WebElement selectSize = driver.findElement(By.id("pa_size"));
        Select selectt = new Select(selectSize);
        selectt.selectByVisibleText("42");
        System.out.println("Select Dropdown Size");
        driver.findElement(By.xpath("//*[@id=\"product-1491\"]/div[1]/div[2]/form/div/div[2]/button")).click();
        System.out.println("Add 1 product to cart Done");
    }
    static void scroll(int pixel){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+pixel+")"); //scroll down vertikal 500px
    }
}
