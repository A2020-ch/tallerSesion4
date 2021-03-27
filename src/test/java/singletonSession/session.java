package singletonSession;

import factoryDevice.factoryDevices;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class session {
    // attributo del mismo tipo de la clase
    private static session mySession = null;
    private AppiumDriver driver;

    // constructor debe ser privado
    private session() throws MalformedURLException {
        //driver= factoryDevices.make(factoryDevices.CLOUD_DEVICE).create();
        driver= factoryDevices.make(factoryDevices.ANDROID).create();
    }

    // metodo estatico para determinar la creacion del atributo del mismo tipo de la clase
    public static session getInstance() throws MalformedURLException {
        if (mySession==null)
            mySession= new session();

        return mySession;
    }

    public void closeSession(){
        driver.quit();
        mySession=null;
    }

    public AppiumDriver getDriver(){
        return driver;
    }
}
