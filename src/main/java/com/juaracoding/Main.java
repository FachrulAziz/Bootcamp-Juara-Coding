package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.AddProduct;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class Main {
    static WebDriver driver;

    public static void main(String[] args) {

        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get(" https://shop.demoqa.com");
        delay(2);
        driver.get("https://shop.demoqa.com/my-account/");

        LoginPage loginPage = new LoginPage();
        loginPage.login("fachrulaziz95","vegazr4362");

        AddProduct addProduct = new AddProduct();
        addProduct.getClass();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DriverSingleton.closeObjectInstance();
    }
    static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}