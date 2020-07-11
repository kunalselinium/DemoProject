package org.testing.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class LoginPage {

    ChromeDriver cdriver;
    Properties pr;
    Properties pr1;


    public LoginPage(ChromeDriver cdriver, Properties pr,Properties pr1)
    {
        this.cdriver=cdriver;
        this.pr=pr;
        this.pr1=pr1;
    }

    public void SignIn(String userid,String pass) throws InterruptedException
    {
        Thread.sleep(10000);
        WebElement adminStaffButton=cdriver.findElement(By.xpath(pr.getProperty("adminStaffBtn")));
        adminStaffButton.click();
        Thread.sleep(5000);
        WebElement username=cdriver.findElement(By.xpath(pr.getProperty("usrName")));
        username.sendKeys(userid);
        WebElement password=cdriver.findElement(By.xpath(pr.getProperty("pwd")));
        password.sendKeys(pass);
        Thread.sleep(10000);
        WebElement signInButton=cdriver.findElement(By.xpath(pr.getProperty("signInBtn")));
        signInButton.click();
        }
}