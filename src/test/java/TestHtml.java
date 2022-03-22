import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TestHtml {
    public static final String ID_FADEIN_DIV_1_DIV_DIV_2_DIV_2_DIV_FORM_DIV_4_DIV_INPUT = "//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[4]/div/input";

    public static void main(String[] args) {
        WebDriver webDriver = null;
        try {
            webDriver = new HtmlUnitDriver(BrowserVersion.CHROME);
            webDriver.get("https://www.phptravels.net/login");
            System.out.println("driver = " + webDriver.getTitle());
            webDriver.manage().window().maximize();
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("window.scrollBy(0,200)");
            final By xpath = By.className("btn-outline-primary");
            Thread.sleep(5000);
            webDriver.findElement(xpath).click();
            System.out.println("xpath = " + xpath);
            final By firstName = By.xpath("//input[@name='first_name']");
            Thread.sleep(5000);
            webDriver.findElement(firstName).sendKeys("Poonam");
            System.out.println("firstName = " + firstName);
            final By lastName = By.xpath("//input[@name='last_name']");
            Thread.sleep(5000);
            webDriver.findElement(lastName).sendKeys("Fasate");
            System.out.println("lastName = " + lastName);
            final By phone = By.xpath("//input[@name='phone']");
            webDriver.findElement(phone).sendKeys("7387019190");
            System.out.println("phone = " + phone);
            js.executeScript("window.scrollBy(0,200)");
            final By email = By.xpath(ID_FADEIN_DIV_1_DIV_DIV_2_DIV_2_DIV_FORM_DIV_4_DIV_INPUT);
            webDriver.findElement(email).sendKeys("poonamfasate1@gmail.com");
            System.out.println("email = " + email);
            final By password = By.xpath("//input[@name='password']");
            webDriver.findElement(password).sendKeys("shiv0105");
            System.out.println("password = " + password);
            js.executeScript("window.scrollBy(0,200)");
            System.out.println("password = " + password);
            final By xpath1 = By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[7]/button/span[1]");
            webDriver.findElement(xpath1).click();
            System.out.println("xpath1 = " + xpath1);

        } catch (Exception ex) {
        }

    }

}