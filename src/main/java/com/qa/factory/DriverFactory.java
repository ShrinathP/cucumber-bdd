package com.qa.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class DriverFactory {

    /**
     * We are creating a ThreadLocal for holding webDriver Instances,
     * helps in parallel Execution
     */
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    /**
     * This method is used to initialize the threadlocal driver on the basis of the given browser
     * @param browser
     * @return this will return WebDriver instance inside tlDriver
     */
    public WebDriver initDriver(String browser) {
        System.out.printf("Browser value is %s", browser);

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        } else if (browser.equals("safari")) {
            tlDriver.set(new SafariDriver());
        }
        else {
            System.out.println("Please pass the correct browser value" + browser);
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }

    /**
     * this is used to get the driver with ThreadLocal
     * Making synchronized as multiple threads can call getDriver
     * @return
     */
    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }

}
