package myprojects.automation.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {

            // TODO return  WebDriver instance
        //Find the driver for FireFox
            String driverPath = System.getProperty("user.dir");

            if (driverPath == null) {
                throw new SecurityException("Method doesn't return WebDriver instance");
            }
            System.setProperty("webdriver.gecko.driver", driverPath + "/src/main/resources/geckodriver");
            return new FirefoxDriver();
        }
    }

