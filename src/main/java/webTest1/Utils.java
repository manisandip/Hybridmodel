package webTest1;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class Utils extends BasePage {
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //select from dropdown by value method
    public static void selectFromDropdownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    public static void selectTextFromDropDown(By by, String text) {
        Select selectCountry = new Select(driver.findElement(by));
        selectCountry.selectByValue(text);

    }
    public static void assertURL (String text)
    {
        assertTrue(driver.getCurrentUrl().contains(text));
    }
    public static void sendText (By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    public static String TimeStamp ()
    {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    public static String getTextFromElement (By by){
        return driver.findElement(by).getText();
    }
    public static void assertTextMessage (String message, String expected, By by){
        String actual = getTextFromElement(by);
        assertEquals(message, expected, actual);
    }
    public static void takeScreenShot (String fileName){
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            FileUtils.copyFile(scrFile, new File("src\\test\\resources\\Screenshots\\" + fileName + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void WaitForClickable (By by,int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public void EnterText (By by, String text){
        driver.findElement(by).sendKeys(text);
        WaitForClickable(by, 60);
    }
    public static void TimeDelay ( int time){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
