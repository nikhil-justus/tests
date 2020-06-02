package com.shopf.automation.tests;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class VerifyPos {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "/Users/nikhiljustus/Downloads/chromedriver");
        WebDriver sra = new ChromeDriver();
        sra.get("https://shopup.com.bd/r");
        int i=0;
        List<WebElement> all = sra.findElements(By.tagName("a"));
        for (WebElement e:all){
            System.out.println(i);
            System.out.println(e.getAttribute("href"));
            i++;
        }
        sra.quit();

    }

}
