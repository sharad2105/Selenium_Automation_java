package com.bridgelabz.selenium.utilities;

import com.bridgelabz.selenium.base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Screenshot extends Base {
    public void takescreenshot(String String){
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\Admin\\IdeaProjects\\Flipcart_Automation\\src\\main\\java\\com\\bridgelabz\\selenium\\screenshot/"+String+".jpg"));
        } catch (IOException e) {
            System.out.println("Exxeptiojn" +e);
            e.printStackTrace();
        }
    }
}
