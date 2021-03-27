package factoryDevice;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public interface IDevice {
    default AppiumDriver create() throws MalformedURLException, MalformedURLException {
        return null;
    }
}
