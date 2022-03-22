package katlonex;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class FlipkartTest1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testFlipkartTest1() throws Exception {
    driver.get("https://www.google.com/search?q=Flipcart&rlz=1C1CHBD_enIN762IN762&oq=Flipcart&aqs=chrome..69i57j46i10i131i199i433i465j0i10i433j0i10i131i433l2j0i10i433l2j0i10i131i395i433j0i10i395i433.6876j1j7&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/a/h3")).click();
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Back to top'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("//div[@id='container']/div/div[2]/div/div/div[8]/a/div")).click();
    driver.findElement(By.linkText("Nuts & Dry Fruits")).click();
    driver.findElement(By.linkText("Cadbury Bournvita 5 Star Magic Health 750 G Pouch X 2 (...")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div/div[2]/div/ul/li/button")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | link=Cadbury Bournvita 5 Star Magic Health 750 G Pouch X 2 (... | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
