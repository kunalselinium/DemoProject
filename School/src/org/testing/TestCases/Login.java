package org.testing.TestCases;

import org.testing.Base.Base;
import org.testing.Pages.LoginPage;
import org.testing.Utilities.Logs;
import org.testing.Utilities.Screenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login extends Base {

    String expectedURL="http://esf.esfkw.com/admin/";

    @Test
    public void LoginFunctionality() throws InterruptedException, IOException {
        try {
            LoginPage l=new LoginPage(cdriver,pr,pr1);
            l.SignIn(pr1.getProperty("username"), pr1.getProperty("password"));
            Assert.assertEquals(cdriver.getCurrentUrl(),expectedURL);
            Logs.takeLogs("Login", "Login successfully");
            Screenshot.takeScreenshot(cdriver, "../School/Screenshots/Login_Passed.png");

        }
        catch(Exception e)
        {
            e.printStackTrace();
            Logs.takeLogs("Login", "Login failed");
            Screenshot.takeScreenshot(cdriver, "../School/Screenshots/Login_Failed.png");
        }
    }
}