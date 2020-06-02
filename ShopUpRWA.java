package com.shopf.automation.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ShopUpRWA {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/nikhiljustus/Downloads/chromedriver");
        WebDriver sra = new ChromeDriver();
        sra.get("https://shopup.com.bd/r");
        sra.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        int dl = 0,clwe = 0,nwl=0;
        Alert alert = sra.switchTo().alert();
        sra.switchTo().alert().dismiss();
        List<WebElement> all = sra.findElements(By.tagName("a"));
        int te = all.size();
        for (WebElement e:all) {
            String l = e.getAttribute("href");
            if(e!=null && l!=null) {
                    e.click();
            }
            else
                dl++;
        }
        System.out.println(dl);
        sra.quit();
    }
}

