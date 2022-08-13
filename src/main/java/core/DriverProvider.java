package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverProvider {

    private static volatile WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {
            synchronized (DriverProvider.class) {
                if (driver == null) {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--incognito");
                    options.addArguments("--start-maximized");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }
            }
        }
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
        driver = null;
    }
}
