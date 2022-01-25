package com.AutomationAssignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationAssignment1 {
    public static void main(String[] args) throws  Exception {
        //launch browser Firefox
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        WebDriver firfox_driver = new FirefoxDriver();   //FirefoxDriver=interface
        firfox_driver.get("https://www.google.com/");
        firfox_driver.close();

        //launch browser Chrome
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.close();

        //launch browser Opera
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/operadriver.exe");
        WebDriver opera_driver = new ChromeDriver();
        opera_driver.get("https://www.google.com/");
        opera_driver.close();

        //launch browser Edge
        System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
        WebDriver edge_driver = new EdgeDriver();
        edge_driver.get("https://www.google.com/");
        edge_driver.close();



    }
}
