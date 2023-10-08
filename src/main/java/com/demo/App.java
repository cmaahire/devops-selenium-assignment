package com.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //Setup Chromedriver
        WebDriverManager.chromedriver().setup();

        //Setup chrome parameters
        ChromeOptions chromeoptions =new ChromeOptions();
        chromeoptions.addArguments("--headless");

        //Initialize web driver
        WebDriver driver = new ChromeDriver(chromeoptions);

        //Open the URL in the browser
        driver.get("https://www.facebook.com/");

        //Maximize Browser Window
        driver.manage().window().maximize();

        //Locate email field and enter email address
        driver.findElement(By.id("email")).sendKeys("test1@gmail.com");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //locate password and enter password
        driver.findElement(By.id("pass")).sendKeys("passtest");

        //locate login and click
        driver.findElement(By.name("login")).click();

        //Close the browser
        driver.close();

    }
}
