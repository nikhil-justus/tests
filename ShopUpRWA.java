package com.shopf.automation.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ShopUpRWA {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "/Users/nikhiljustus/Downloads/chromedriver");
        WebDriver sra = new ChromeDriver();
        sra.get("https://shopup.com.bd/r");
        Thread.sleep(2000);
        int dl = 0,wl = 0,nwl=0; String l="0",cl="0";
        List<WebElement> all = sra.findElements(By.tagName("a"));
        String mainW = sra.getWindowHandle();
        for (WebElement e:all) {
            l = e.getAttribute("href");
            if(!l.contains("@shopf.co")){
                sra.switchTo().window(mainW);
                String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
                e.sendKeys(selectLinkOpeninNewTab);
                cl=sra.getCurrentUrl();
                sra.navigate().to("https://shopup.com.bd/r");
                Thread.sleep(1000);
                Iterator<String> wind = sra.getWindowHandles().iterator();
                while(wind.hasNext())
                {
                    String subW = sra.getWindowHandle();
                    if(!subW.equals(mainW))
                    {
                        sra.switchTo().window(subW);
                        cl = sra.getCurrentUrl();
                        sra.close();
                    }

                }
                if(cl.equalsIgnoreCase(l)) wl++;
                else nwl++;
                //sra.switchTo().window(mainW);
            }
        }
        System.out.println(dl);
        sra.quit();
    }
}

