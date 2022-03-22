import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo {
    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver= new ChromeDriver();
        webDriver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        webDriver.manage().window().maximize();
        Thread.sleep(2000);
        final By xpath = By.xpath("//input[@name='firstname']");
        webDriver.findElement(xpath).sendKeys("Poonam");
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);
        final By xpath1 = By.xpath("//input[@name='lastname']");
        webDriver.findElement(xpath1).sendKeys("Fasate");

        webDriver.findElement(By.xpath("//input[@id='sex-1']")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.id("exp-6")).click();
        webDriver.findElement(By.id("datepicker")).sendKeys("23/02/22");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//input[@id='profession-1']")).click();
        webDriver.findElement(By.id("tool-2")).click();
        Thread.sleep(2000);
        Select con= new Select(webDriver.findElement(By.id("continents")));
        con.selectByIndex(2);
        WebElement e = webDriver.findElement(By.id("selenium_commands"));
        Select s = new Select(e);
        s.selectByIndex(1);
        s.selectByIndex(3);

        WebElement upload_file = webDriver.findElement(By.id("photo"));
        upload_file.sendKeys("D:\\PPT");
    }
}
