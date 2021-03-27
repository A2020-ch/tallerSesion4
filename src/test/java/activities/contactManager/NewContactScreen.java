package activities.contactManager;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class NewContactScreen {

    public TextBox nameTxtbox = new TextBox(By.xpath("//android.widget.EditText[@text='Nombre']"));
    public TextBox telephoneTxtbox = new TextBox(By.xpath("//android.widget.EditText[@text='Teléfono']"));
    public Button saveButton = new Button(By.xpath("//android.widget.TextView[@text='Guardar']"));

    public void NewContactScreen(){}
}
