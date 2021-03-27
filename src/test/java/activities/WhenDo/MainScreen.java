package activities.WhenDo;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addContact = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public MainScreen(){}

    public boolean isDispledTitle(String title){
        Label titleContact= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return titleContact.isControlDisplayed();
    }
}
