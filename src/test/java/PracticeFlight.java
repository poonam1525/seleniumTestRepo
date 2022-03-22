import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFlight {
    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter("test.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test1 = extent.createTest("Amazon test");
        String projectpath= System.getProperty("User.dir");

        WebDriverManager.chromedriver().setup();
        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://www.amazon.in/");
        webdriver.manage().window().maximize();

        final By xpath = By.xpath("//a[contains(text(),'Fashion')]");
        webdriver.findElement(xpath).click();
        test1.pass("click on Fashion");
        final By xpath1 = By.xpath("//*[@id=\"nav-subnav\"]/a[2]/span[1]");
        webdriver.findElement(xpath1).click();
        test1.pass("click on Women");

        /*JavascriptExecutor js = (JavascriptExecutor) webdriver;
        js.executeScript("window.scrollBy(0,400)");
*/
        final By xpath2 = By.xpath("//span[@class='hm-icon-label']");
        webdriver.findElement(xpath2).click();

        JavascriptExecutor js = (JavascriptExecutor) webdriver;
        js.executeScript("window.scrollBy(0,400)");
        webdriver.quit();
        test1.pass("closed the browser");
        test1.info("Test completed");
        extent.flush();

    }
}
