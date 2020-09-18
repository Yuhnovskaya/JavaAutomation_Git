package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public
class DriverSingleton {
    public static WebDriver driver;

    private
    DriverSingleton() {
    }

    public static
    WebDriver getDriver() {
        if (null == driver) {
            switch (System.getProperty("browser")/*TestData.browser*/) {
                case "firefox": {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                default: {

                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--start-maximized");
                    driver = new ChromeDriver(options);
                }
            }
            driver.manage().window().setSize(new Dimension(1280,900));
        }
        return driver;
    }

    public static
    void closeDriver() {
        driver.quit();
        driver = null;
    }
}
