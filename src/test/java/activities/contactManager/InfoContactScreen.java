package activities.contactManager;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;

public class InfoContactScreen {

    public Button backbutton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]"));

    public void InfoContactScreen(){}
    public boolean verifyContactIsDisplayed(String contact){
        Label infocontact = new Label(By.xpath("//android.widget.TextView[@text='"+contact+"']"));
        return infocontact.isControlDisplayed();
    }

}
