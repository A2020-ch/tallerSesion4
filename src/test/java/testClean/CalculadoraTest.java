package testClean;

import activities.MainCalculatorActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import singletonSession.session;

import java.net.MalformedURLException;

public class CalculadoraTest {

    MainCalculatorActivity mainCalculatorActivity= new MainCalculatorActivity();

    @Test
    public void sumarCalculadoraTest() throws MalformedURLException, MalformedURLException {
        mainCalculatorActivity.nueveButton.click();
        mainCalculatorActivity.sumaButton.click();
        mainCalculatorActivity.dosButton.click();
        mainCalculatorActivity.equalButton.click();
        Assert.assertEquals("Error en la Suma", "11", mainCalculatorActivity.resultLabel.getText());
    }

    @After
    public void after() throws MalformedURLException {
        session.getInstance().closeSession();
    }
}
