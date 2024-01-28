package Utility;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import sun.text.normalizer.Utility;

public class Main extends  BaseDriver{
    @Test
    public  void Us5(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#HM_v8 > i > a")));
        WebElement main=driver.findElement(By.cssSelector("#HM_v8 > i > a"));
        main.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#AL > li.order.first > a:nth-child(2)")));
        WebElement order=driver.findElement(By.cssSelector("#AL > li.order.first > a:nth-child(2)"));
        order.click();
        WebElement msg=driver.findElement(By.cssSelector("[class='no-record']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='no-record']")));
        Assert.assertTrue("Warning",msg.getText().contains("bulunmuyor"));
        driver.navigate().back();
    }
    @Test
    public void Us6(){
        WebElement msgBox=driver.findElement(By.cssSelector("#AL > li.order.first > a:nth-child(3)"));
        msgBox.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#C4w > div > p")));
        WebElement msgWarning=driver.findElement(By.cssSelector("#C4w > div > p"));
        Assert.assertTrue("Warning",msgWarning.getText().contains("bulunamadı"));
        driver.navigate().back();
    }
    @Test
    public void Us7() {
        WebElement deleteAccount=driver.findElement(By.cssSelector("#AL > li:nth-child(4) > a:nth-child(5)"));
        deleteAccount.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#p")));
        WebElement passwordDelete=driver.findElement(By.cssSelector("#p"));
        passwordDelete.sendKeys("Deniz3344.");
        WebElement deleting=driver.findElement(By.cssSelector("#u"));
        deleting.click();
        WebElement deleteVerification=driver.findElement(By.cssSelector("#C4w > ul > li > p > i"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#C4w > ul > li > p > i")));
        Assert.assertTrue("Warning",deleteVerification.getText().contains("silindi"));
       closeDriver();
    }
}
