package runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyStepcontact {
    private AppiumDriver driver;
    @Given("tengo abierto mi app de contacto")
    public void tengoAbiertoMiAppDeContacto() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","moto e5 plus");
        capabilities.setCapability("platformVersion","8.0.0");
        capabilities.setCapability("appPackage","com.google.android.contacts");
        capabilities.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
        capabilities.setCapability("platformName","Android");

        //driver apunte a nuestro appiumdesktop
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        //implicit:
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @When("yo hago click en el boton {string}")
    public void yoHagoClickEnElBoton(String nambreControl) {
        switch (nambreControl) {
            case "add":
                driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Crear contacto'] ")).click();
                break;
            case "done":
                driver.findElement(By.xpath("//android.widget.TextView[@text='Guardar']")).click();
                break;
            case "back":
                driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]")).click();
                break;

        }
    }

    @And("yo lleno la caja de texto {} con el valor {string}")
    public void yoLlenoLaCajaDeTextoNameConElValor(String control,String value) {
        switch (control) {
            case "name":
                ((MobileElement)driver.findElement(By.xpath("//android.widget.EditText[@text='Nombre']"))).sendKeys(value);

                break;

            case "phone":
                driver.findElement(By.xpath("//android.widget.EditText[@text='Teléfono']")).sendKeys(value);

                break;

        }

    }

    @Then("el contacto {string} deberia ser mostrado")
    public void elContactoDeberiaSerMostrado(String expectedResult) {
        boolean isDisplayed=driver.findElement(By.xpath("//android.widget.TextView[@text='"+expectedResult+"']")).isDisplayed();
        Assert.assertTrue("ERROR el contacto no es mostrado en la lista",isDisplayed);
        driver.quit();
    }
}

