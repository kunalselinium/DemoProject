package org.testing.Utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public  static void takeScreenshot(ChromeDriver driver, String path) throws IOException {
        File f=driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File(path));
        Logs.takeLogs("Screenshot", "Screenshot taken successfully");
    }
}
