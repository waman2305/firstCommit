package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainWebDriver {

    private static WebDriver driver;


    public static void startDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/browserDrivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            startDriver();
        }
        return driver;

    }

}
