import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;

public class TestNGDemo3 {
    private static Logger logger = LogManager.getLogger(TestNGDemo3.class);
    WebDriver webdriver = null;

    @BeforeMethod
    public void setUp() {
        logger.info("inside setup");
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");

        WebDriverManager.chromedriver().setup();
        webdriver = new ChromeDriver();
    }

    @Test
    public void test2() throws InterruptedException {
        logger.info("inside test2");

        webdriver.get("https://www.phptravels.net/login");
        webdriver.manage().window().maximize();

        final By xpath = By.xpath("//*[contains(text(),'Home')]");
        Thread.sleep(3000);
        webdriver.findElement(xpath).click();
        final By id = By.xpath("//span[@title=' Search by City' and @role='textbox' and @id='select2-hotels_city-container']");
        webdriver.findElement(id).click();
        webdriver.findElement(By.xpath("//input[@type='search' and @role='searchbox']")).sendKeys("Mumbai");
        final List<WebElement> elements = webdriver.findElements(By.xpath("//li/i[@class='flag in']"));
        for (WebElement element : elements) {
            System.out.println("element = " + element.getText());
            element.click();
        }
        webdriver.findElement(By.xpath("//button[@type='submit' and @id='submit' and @class='btn btn-primary btn-block btn-lg effect ladda-button waves-effect']")).click();
        logger.info("end of test2");
    }

    @Test
    public void test4() {
        System.out.println("Inside test4");
    }

    @AfterMethod
    public void close() {
        webdriver.close();
        logger.info("closing the browser");

    }
}
