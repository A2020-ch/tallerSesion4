package activities.contactManager;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addcontactButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc='Crear contacto'] "));

    public MainScreen(){}

    public boolean contactIsDisplayedInListContact(String valueContact){
        Label contact= new Label(By.xpath("//android.widget.TextView[@text='"+valueContact+"']"));
        return contact.isControlDisplayed();

    }
}
