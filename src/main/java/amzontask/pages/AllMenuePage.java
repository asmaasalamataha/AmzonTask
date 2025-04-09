package amzontask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class AllMenuePage {


    // Variables
    WebDriver driver;
    Wait wait;

    //locators
    By AllMenuebuttoum = By.className("hm-icon nav-sprite");
    By videogamesarrow = By.xpath("//a[@class='hmenu-item']/div[contains(.,'Video Games')]");
    By regestritionInfo = By.cssSelector("#ap_email_login");

    public void ALLMenuePage(){

}
