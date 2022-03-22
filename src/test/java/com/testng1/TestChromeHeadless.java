package com.testng1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestChromeHeadless {
    @Test
    public void test1() {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
       // options.addArguments("--windows-size=1366,768");
        options.addArguments("window-size=1920,1200");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        final By xpath = By.xpath("//input[@name='firstname']");
        driver.findElement(xpath).sendKeys("Poonam");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        final By xpath1 = By.xpath("//input[@name='lastname']");
        driver.findElement(xpath1).sendKeys("Fasate");
        driver.quit();
    }
}
