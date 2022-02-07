package AppHooks;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class ApplicationHooks {

    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties prop;

    @Before(order = 0)
    public void getProperty() throws IOException {
        configReader = new ConfigReader();
        prop = configReader.initProperties();
    }

    @Before(order = 1)
    public void launchBrowser() {
        String browserName = prop.getProperty("browser");
        driverFactory = new DriverFactory();
        //driver = driverFactory.initDriver(browserName);
    }

    //For @After annotation, methods run in descending order
    //order 1 will be run first then 0
    @After(order = 0)
    public void quitBrowser() {
        System.out.println("Quitting Browser");
        //driver.quit();
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            //take screenshot:
            String screenshotName = scenario.getName().replaceAll(" ", "_" );
            byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);

        }
    }
}
