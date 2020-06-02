package com.shopf.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HttpCon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/nikhiljustus/Downloads/chromedriver");
        WebDriver sra = new ChromeDriver();
        sra.get("https://shopup.com.bd/r");
        sra.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        sra.manage().window().maximize();
        HttpCon o = new HttpCon();
        int rc = 0,clwe = 0,nwl=0;
        List<WebElement> all = sra.findElements(By.tagName("a"));
        System.out.println("Total links: "+all.size());

        for (WebElement e:all) {
            String l = e.getAttribute("href");
            if(e!=null && l!=null)
               o.verify(l);

        }
        System.out.println("*** Check Complete ***");
        sra.quit();

    }
    public void verify(String link){

        try {
            URL u = new URL(link);
            HttpURLConnection hC = (HttpURLConnection)u.openConnection();
            hC.setConnectTimeout(500);
            hC.connect();
            int rc = hC.getResponseCode();
            if(rc!=200)
                System.out.println(rc + " - " +link);

        }catch (Exception exception){}

    }
}
