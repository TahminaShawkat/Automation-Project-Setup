package com.AutomationAssignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomationAssignment1{
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        Chrome_Launch();
        Chrome_Wait();
        Chrome_Close();
        Firefox_Launch();
        Firefox_Wait();
        Firefox_Close();
        Opera_Launch();
        Opera_Wait();
        Opera_Close();
        Edge_Launch();
        Edge_Wait();
        Edge_Close();
    }
    // Chrome Launch, Open website, close
    public static void Chrome_Launch(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    public static void Chrome_Wait() throws InterruptedException {
       Thread.sleep(1000);
    }
    public static void Chrome_Close(){
        driver.close();
    }
    // Firefox Launch, Open website, close
    public static void Firefox_Launch(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.firefox.com/");
    }
    public static void Firefox_Wait() throws InterruptedException {
        Thread.sleep(1000);
    }
    public static void Firefox_Close(){
        driver.close();
    }
    // Opera Launch, Open website, close
    public static void Opera_Launch(){
        System.setProperty("webdriver.opera.driver","src/main/resources/operadriver.exe");
        driver = new OperaDriver();
        driver.get("https://www.opera.com/");
    }
    public static void Opera_Wait() throws InterruptedException {
        Thread.sleep(1000);
    }
    public static void Opera_Close(){
        driver.close();
    }
    // Edge Launch, Open website, close
    public static void Edge_Launch(){
        System.setProperty("webdriver.edge.driver","src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.microsoft.com/en-us/edge");
    }
    public static void Edge_Wait() throws InterruptedException {
        Thread.sleep(1000);
    }
    public static void Edge_Close(){
        driver.close();
    }

}

