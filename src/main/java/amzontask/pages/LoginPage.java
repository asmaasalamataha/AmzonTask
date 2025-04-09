package amzontask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.Scanner;

public class LoginPage {

    // Variables
     WebDriver driver;
     Wait wait;

    // locators
    By accountListView = By.cssSelector("#nav-link-accountList");
    By signUp = By.xpath("//a[@class='nav-a']");
    By regestritionInfo = By.cssSelector("#ap_email_login");
    By continureButtom = By.className("a-button-input");
    By continueAndProceedButtom =By.className("a-button-input");
    //span[text() = 'Sign in']
    By signInButtom = By.xpath("//a[@data-nav-ref='nav_signin']/span[@class='nav-action-inner']");
    By passwordField =By.id("ap_password");
    By signInSubmit =By.id("signInSubmit");
    By emailField = By.id("ap_email");
    By captchaSubmitField = By.className("a-button-text");
    By captchaField = By.id("captchacharacters");

    //methods
   //default constructor
   public LoginPage(WebDriver driver){
        this.driver=driver;
    }
   public void setlogin (){

       String captchaInput = JOptionPane.showInputDialog("Enter CAPTCHA:");
       System.out.println("✅ تم إدخال CAPTCHA: " + captchaInput);
       driver.findElement(captchaField).sendKeys(captchaInput);
       // النقر على زر الإرسال بعد إدخال CAPTCHA
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.findElement(captchaSubmitField).click();
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      // driver.findElement(accountListView).click();
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      // driver.findElement(signInButtom).click();
       WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
       Actions actions = new Actions(driver);
       actions.moveToElement(accountList).perform();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-nav-ref='nav_signin']/span[@class='nav-action-inner']")));
       signInButton.click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.findElement(emailField).sendKeys("01111394436"+ Keys.ENTER);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.findElement(passwordField).sendKeys("Asmaa_1234"+Keys.ENTER);


   }


}
