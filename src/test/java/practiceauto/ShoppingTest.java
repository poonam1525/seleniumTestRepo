package practiceauto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ShoppingTest {
    @Test
    public void run() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.findElement(By.id("block_top_menu")).click();
        //driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Dresses");
        final List<WebElement> elements = driver.findElements(By.xpath("//ul/li/a[@title='Dresses']"));
        elements.get(1).click();
        //driver.quit();
    }
}
