package factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudDevice implements IDevice {

    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "axelchacaliaza1");
        caps.setCapability("browserstack.key", "Wx2U5B79H6sVEujBcQqS");

        // Set URL of the application under test
        caps.setCapability("app", "bs://200363fc58bd30c0e9b297a34b41531a34322b6c");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "JBGroup Movile");
        caps.setCapability("build", "V000.1");
        caps.setCapability("name", "my connection to browser stack");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        return driver;
    }


}
