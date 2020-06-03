package com.shopf.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class VerifyLink {
    public static void main(String[] args) throws InterruptedException
    {
        VerifyLink v = new VerifyLink();
        System.setProperty("webdriver.chrome.driver", "/Users/nikhiljustus/Downloads/chromedriver");
        WebDriver sra = new ChromeDriver();
        sra.get("https://shopup.com.bd/r");
        Thread.sleep(1000);
        int dl = 0,wl = 0,nwl=0; String l=" ",cl=" ";
        List<WebElement> all = sra.findElements(By.tagName("a"));
        System.out.println(all.size());
        for(int i=5;i<all.size();i++){
            System.out.print(i+".");
            v.clickOn(all.get(i),sra,10);
            //all.get(i).click();
            Thread.sleep(1000);
            try{l = sra.getCurrentUrl();}
            catch (Exception e){
                System.out.println(e);
            }
            sra.navigate().to("https://shopup.com.bd/r");
            Thread.sleep(1000);
            System.out.println(cl+" - "+all.get(i).getAttribute("href"));
            Thread.sleep(1000);
            all = sra.findElements(By.tagName("a"));

        }
    }
    public void clickOn(WebElement element, WebDriver driver, int timeout)
    {
        final WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(element)));
        element.click();
    }
}
