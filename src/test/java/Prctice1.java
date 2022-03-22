import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Prctice1 {
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        final By xpath = By.xpath("//input[@name='firstname']");
        driver.findElement(xpath).sendKeys("Poonam");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        final By xpath1 = By.xpath("//input[@name='lastname']");
        driver.findElement(xpath1).sendKeys("Fasate");

        driver.findElement(By.xpath("//input[@id='sex-1']")).click();
        driver.findElement(By.id("exp-6")).click();
        driver.findElement(By.id("datepicker")).sendKeys("23/02/22");
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        driver.findElement(By.id("tool-2")).click();
        Select con= new Select(driver.findElement(By.id("continents")));
        con.selectByIndex(2);
        WebElement e = driver.findElement(By.id("selenium_commands"));
        Select s = new Select(e);
        s.selectByIndex(1);
        s.selectByIndex(3);

        WebElement upload_file = driver.findElement(By.id("photo"));
        upload_file.sendKeys("D:\\PPT");


    }
}
