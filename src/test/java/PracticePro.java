import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class PracticePro {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webdriver = new ChromeDriver();
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
        //webdriver.findElement(By.xpath("//li/i")).click();
//        Select dropdown= new Select(webdriver.findElement(By.className("select2-results__option select2-results__option--highlighted")));
//        dropdown.selectByIndex(0);
        webdriver.findElement(By.xpath("//button[@type='submit' and @id='submit' and @class='btn btn-primary btn-block btn-lg effect ladda-button waves-effect']")).click();


    }
}