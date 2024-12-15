package com.two.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!!!" );
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://artoftesting.com/samplesiteforselenium");
        Thread.sleep(1000);
//        driver.findElement(By.className("inside-header grid-container"));
//        driver.findElement(By.className("main-title")).click();
        
        driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/p[1]/a")).click();
        
        driver.findElement(By.id("fname")).sendKeys("Pyaare");
        driver.findElement(By.id("idOfButton")).click();
        driver.findElement(By.id("dblClkBtn")).click();
//        
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.id("dblClkBtn"));
        act.doubleClick(ele).perform();        
    }
}
