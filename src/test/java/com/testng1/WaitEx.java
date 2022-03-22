package com.testng1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WaitEx {
        WebDriver webdriver = null;
        @Test
        public void setUp() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            webdriver = new ChromeDriver();
            webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            webdriver.get("https://www.phptravels.net/login");
            webdriver.manage().window().maximize();

            final By xpath = By.xpath("//*[contains(text(),'Home')]");
            webdriver.findElement(xpath).click();
            WebDriverWait wait= new WebDriverWait(webdriver,20);
            WebElement webElement= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title=' Search by City' and @role='textbox' and @id='select2-hotels_city-container']")));
            final By id = By.xpath("//span[@title=' Search by City' and @role='textbox' and @id='select2-hotels_city-container']");
            webdriver.findElement(id).click();
            webdriver.findElement(By.xpath("//input[@type='search' and @role='searchbox']")).sendKeys("Mumbai");

            final List<WebElement> elements = webdriver.findElements(By.xpath("//li/i[@class='flag in']"));
            for (WebElement element1 : elements) {
                System.out.println("element = " + element1.getText());
                element1.click();
            }
            webdriver.findElement(By.xpath("//button[@type='submit' and @id='submit' and @class='btn btn-primary btn-block btn-lg effect ladda-button waves-effect']")).click();
        }


           // webdriver.close();

        }



