package factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice{
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","moto e5 plus");
        capabilities.setCapability("platformVersion","8.0.0");
        capabilities.setCapability("appPackage","com.google.android.calculator");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        capabilities.setCapability("platformName","android");

        //driver apunte a nuestro appiumdesktop
        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        //implicit:
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    return driver;
    }
}
