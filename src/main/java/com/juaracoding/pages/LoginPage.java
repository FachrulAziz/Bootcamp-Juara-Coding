package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@name='username']")
    WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    WebElement btnLogin;

    public void login(String username, String password){
        delay(2);
        this.username.sendKeys(username);
        delays(2);
        this.password.sendKeys(password);
        btnLogin.click();
    }
    static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    static void delays(long detik) {
        try {
            Thread.sleep(detik * 500); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
