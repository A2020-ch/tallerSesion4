package runner;

import activities.MainCalculatorScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class MyStepClean {

    MainCalculatorScreen mainCalculatorScreen= new MainCalculatorScreen();
    @Given("I have access to Calculator App")
    public void iHaveAccessToCalculatorApp() {

    }

    @When("I click the {} button on main screen")

    public void iClickTheNineButtonOnMainScreen(String nameControl) throws  MalformedURLException {
            mainCalculatorScreen.buttonMap.get(nameControl).click();

    }


    @Then("the result should be {string}")
    public void theResultShouldBe(String expectedResult) throws MalformedURLException {
        Assert.assertEquals("Error en la Suma",
                expectedResult,
                mainCalculatorScreen.resultLabel.getText());
    }
}
