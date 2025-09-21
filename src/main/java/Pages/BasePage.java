package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BasePage {

    public static WebDriver driver;
    static JavascriptExecutor js ;
    WebDriverWait wait;

    //Constructor
    public BasePage(WebDriver driver) throws AWTException {
        this.driver = driver;
        js= (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

     public void ScrollDownToSpecificElement(WebElement X){
         js.executeScript("arguments[0].scrollIntoView();", X);
     }

}