package testClean;

import activities.contactManager.InfoContactScreen;
import activities.contactManager.MainScreen;
import activities.contactManager.NewContactScreen;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import singletonSession.session;

import java.net.MalformedURLException;

public class ContactManagerTest {
    InfoContactScreen infoContactScreen= new InfoContactScreen();
    MainScreen mainScreen= new MainScreen();
    NewContactScreen newContactScreen= new NewContactScreen();


    @Test
    public void createContact() throws MalformedURLException, MalformedURLException {
        String name="AAARemoveJB";
        String phone="123123123";

        mainScreen.addcontactButton.click();
        newContactScreen.nameTxtbox.setText(name);
        newContactScreen.telephoneTxtbox.setText(phone);
        newContactScreen.saveButton.click();

        Assert.assertTrue("ERROR no se creo el contacto",infoContactScreen.verifyContactIsDisplayed(name));

        infoContactScreen.backbutton.click();

        Assert.assertTrue("ERROR el contacto no es listado",mainScreen.contactIsDisplayedInListContact(name));

    }

    @After
    public void after() throws MalformedURLException {
        session.getInstance().closeSession();
    }
}
