package activities;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MainCalculatorActivity {
    public Button sumaButton = new Button(By.xpath("//android.widget.Button[@content-desc=\"más\"]"));
    public Button equalButton = new Button(By.xpath("//android.widget.Button[@content-desc=\"igual a\"]"));
    public Button nueveButton = new Button(By.xpath("//android.widget.Button[@text='9']"));
    public Button dosButton = new Button(By.xpath("//android.widget.Button[@text='2']"));
    public Label resultLabel = new Label(By.xpath("//android.widget.TextView[@resource-id='com.google.android.calculator:id/result_final']"));

    public MainCalculatorActivity(){}

}
