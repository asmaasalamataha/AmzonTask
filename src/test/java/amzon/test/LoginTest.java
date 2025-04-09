package amzon.test;

import amzontask.pages.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.util.Set;

public class LoginTest {

   WebDriver driver;

   // object from the class LoginPage
   LoginPage loginpage;

   @BeforeTest
   public void setup (){



      WebDriver driver = new ChromeDriver();
      driver.navigate().to("https://www.amazon.com/");



      loginpage = new LoginPage(driver);

   }

@Test

public void Login (){

   loginpage.setlogin();



}





  // @AfterTest

 //  public  void  teardown (){

  //    driver.quit();

 //  }



}
