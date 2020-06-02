package com.shopf.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ShopUpLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/nikhiljustus/Downloads/chromedriver");
        WebDriver sul = new ChromeDriver();
        sul.get("https://shopup.com.bd/r");
        sul.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sul.findElement(By.linkText("Login")).click();
        sul.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sul.findElement(By.xpath("//*[@id=\"loginForm\"]/div/label/span[1]")).sendKeys("1877755590");
        sul.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/button")).submit();
        sul.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

}
