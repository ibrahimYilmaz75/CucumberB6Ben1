package Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {
    private static ThreadLocal<WebDriver> threadDriver= new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName= new ThreadLocal<>();

    public static WebDriver getDriver(){
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (threadBrowserName.get()==null)
            threadBrowserName.set("chrome");

        if (threadDriver.get()== null) {// eğer en başta ise
            switch (threadBrowserName.get()){
                case "firefox" : threadDriver.set(new FirefoxDriver());break;
                case "edge":threadDriver.set(new EdgeDriver());break;
                default:threadDriver.set(new ChromeDriver());break;
            }
            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }
        //eğer zaten oluşmuşsa dirverı gönder
        return threadDriver.get();
    }
    public static void quitDriver(){
        try {

            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        if (threadDriver.get() != null)
        {
            threadDriver.get().quit();
            //driver=null;
            WebDriver hattaki= threadDriver.get();
            threadDriver.set(hattaki);
        }


    }
}
