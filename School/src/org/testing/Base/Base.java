package org.testing.Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public ChromeOptions options;
    public ChromeDriver cdriver;
    public Properties pr;
    public Properties pr1;

    @BeforeMethod
    public void BrowserLaunchAndPropertiesLoad() throws IOException {
        File f =new File("../School/or.properties");
        File testdata =new File("../School/testdata.properties");
        FileInputStream fi=new FileInputStream(f);
        FileInputStream fis=new FileInputStream(testdata);
        pr=new Properties();
        pr1=new Properties();
        pr.load(fi);
        pr1.load(fis);
       System.setProperty("webdriver.chrome.driver", "../School/Drivers/chromedriver.exe");
        options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        cdriver=new ChromeDriver(options);
        cdriver.get("http://esf.esfkw.com");
        cdriver.manage().window().maximize();
    }

    @AfterMethod
    public void CloseMethod() throws InterruptedException {
        Thread.sleep(10000);
        cdriver.close();
    }
}