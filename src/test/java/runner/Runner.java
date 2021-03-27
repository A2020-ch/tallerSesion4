package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import singletonSession.session;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
public class Runner {

    @Before
    public void beforeCucumber(){
        System.out.println("before cucumber");

    }

    @After
    public void afterCucumber(Scenario scenario) throws MalformedURLException {

        if (scenario.isFailed()){

            byte[] screenShoot=session.getInstance().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShoot,"image/png","Failed Step Movile");
        }
        session.getInstance().closeSession();

    }
}
