package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;


   static {
    Logger logger=Logger.getLogger("");
    logger.setLevel(Level.SEVERE); // only show warnings
    driver=new ChromeDriver();
    driver.manage().window().maximize(); // windows screen max width
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    wait=new WebDriverWait(driver,Duration.ofSeconds(20));  // elemente özel bekleme kısmı oluşturduk
    // We have completed the tasks 1 2 3 and 4 in the test case here.
    driver.get("https://www.akakce.com/?gad_source=1&gclid=CjwKCAiAk9itBhASEiwA1my_63z10CD7yHJWWZstImT4AlzcO_ozHUPW75Q_GXSG6IF1nad9NisE9RoCs80QAvD_BwE");
    WebElement newAccount=driver.findElement(By.cssSelector("#H_rl_v8 > a:nth-child(1)"));
    newAccount.click();
    WebElement newName=driver.findElement(By.cssSelector("[id='rnufn']"));
    newName.sendKeys("Deniz");
    WebElement newSurname=driver.findElement(By.cssSelector("[id='rnufs']"));
    newSurname.sendKeys("Aydın");
    WebElement newMail=driver.findElement(By.cssSelector("[id='rnufe1']"));
    newMail.sendKeys("denizan561@gmail.com");
    WebElement againMail=driver.findElement(By.cssSelector("[id='rnufe2']"));
    againMail.sendKeys("denizan561@gmail.com");
    WebElement password=driver.findElement(By.cssSelector("[id='rnufp1']"));
    password.sendKeys("Deniz3344.");
    WebElement againPassword=driver.findElement(By.cssSelector("[id='rnufp2']"));
    againPassword.sendKeys("Deniz3344.");
    WebElement gender=driver.findElement(By.cssSelector("[id='rngm']"));
    gender.click();
    MyFunction.wait(2);
    WebElement city=driver.findElement(By.cssSelector("[id='locpr']"));
    Select citySelection=new Select(city);
    citySelection.selectByIndex(2);
    BaseDriver.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='locds']")));
    WebElement district=driver.findElement(By.cssSelector("[id='locds']"));
    Select districtSelection=new Select(district);
    districtSelection.selectByIndex(2);
    WebElement day=driver.findElement(By.cssSelector("[id='bd']"));
    Select daySelection=new Select(day);
    daySelection.selectByIndex(2);
    WebElement month=driver.findElement(By.cssSelector("[id='bm']"));
    Select monthSelection=new Select(month);
    monthSelection.selectByIndex(2);
    WebElement year=driver.findElement(By.cssSelector("[id='by']"));
    Select yearSelection=new Select(year);
    yearSelection.selectByVisibleText("1998");
    WebElement acces=driver.findElement(By.cssSelector("[id='rnufpca']"));
    acces.click();
    WebElement open=driver.findElement(By.cssSelector("[id='rfb']"));
    open.click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#HM_v8 > i > a")));
    WebElement main=driver.findElement(By.cssSelector("#HM_v8 > i > a"));
    Assert.assertTrue(main.getText().contains("Deniz"));
        new Actions(driver).moveToElement(main).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#HM_v8 > ul > li:nth-child(6) > a")));
    WebElement close=driver.findElement(By.cssSelector("#HM_v8 > ul > li:nth-child(6) > a"));
    close.click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#H_rl_v8 > a:nth-child(2)")));
    WebElement sign=driver.findElement(By.cssSelector("#H_rl_v8 > a:nth-child(2)"));
    sign.click();
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='life']")));
    WebElement mail=driver.findElement(By.cssSelector("[id='life']"));
    mail.sendKeys("denizan561@gmail.com");
    WebElement ps=driver.findElement(By.cssSelector("[id='lifp']"));
    ps.sendKeys("Deniz3344.");
    WebElement signIn=driver.findElement(By.cssSelector("[id='lfb']"));
    signIn.click();


    }
   public static void closeDriver(){
   MyFunction.wait(3);
   driver.quit();

    }
}
