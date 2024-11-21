package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD_Old {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (driver== null)// eğer en başta ise
         driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        //eğer zaten oluşmuşsa dirverı gönder
        return driver;
    }
    public static void quitDriver(){
        try {

            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        if (driver != null){
            driver.quit();
            driver=null;
        }


    }
}
