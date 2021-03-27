package activities;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class MainCalculatorScreen {

    public Map<String, Button> buttonMap = new HashMap<>();
    public Label resultLabel= new Label(By.xpath("//android.widget.TextView[@resource-id='com.google.android.calculator:id/result_final']"));

    public MainCalculatorScreen(){

        buttonMap.put("add",new Button(By.id("com.google.android.calculator:id/op_add")));
        buttonMap.put("equal",new Button(By.xpath("//android.widget.Button[@content-desc=\"igual a\"]")));
        buttonMap.put("nine",new Button(By.xpath("//android.widget.Button[@text='9']")));
        buttonMap.put("two",new Button(By.xpath("//android.widget.Button[@text='2']")));

    }
}
