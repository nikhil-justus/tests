package com.shopf.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class InstaLoginAuto {
    public static void main(String[] args) {
     /*   VerifyUser obj = new VerifyUser();
        obj.print();
    }
    public void print(){
        System.out.println("hsksl");
    }*/
        System.setProperty("webdriver.chrome.driver", "/Users/nikhiljustus/Downloads/chromedriver");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.instagram.com/?hl=en");
        wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        wd.findElement(By.linkText("Sign up")).click();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println("Exception handles");
        }
        wd.findElement(By.name("emailOrPhone")).sendKeys("jnikhilyeah@gmail.com");
        wd.findElement(By.name("fullName")).sendKeys("Nikhil Justus");
        wd.findElement(By.name("username")).sendKeys("nikhiljjjustus");
        wd.findElement(By.name("password")).sendKeys("gtasagta");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.manage().window().fullscreen();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println("Exception handles");
        }
        wd.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/form/div[6]/div/div/div/button")).click();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println("Exception");
        }
        wd.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/form/div[7]/div/button")).submit();
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("Exception");
        }
        Select d3 = new Select(wd.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/div[4]/div/div/span/span[3]/select")));
        d3.selectByValue("1998");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select d2 = new Select(wd.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/div[4]/div/div/span/span[2]/select")));
        d2.selectByValue("29");
        Select d1 = new Select(wd.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/div[4]/div/div/span/span[1]/select")));
        d1.selectByValue("10");
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("Exception");
        }
        wd.quit();
    }}




