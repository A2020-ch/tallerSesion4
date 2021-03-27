package testClean;

import activities.WhenDo.MainScreen;
import activities.WhenDo.NewNotes;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import singletonSession.session;

import java.net.MalformedURLException;

public class WhenDoTest {

    MainScreen mainScreen= new MainScreen();
    NewNotes newNotesScrenn= new NewNotes();


    @Test
    public void createNewNote() throws MalformedURLException, InterruptedException, MalformedURLException {
        mainScreen.addContact.click();
        newNotesScrenn.titleTxtBox.setText("JBGroup");
        newNotesScrenn.noteTxtBox.setText("note");
        newNotesScrenn.saveButton.click();

        Thread.sleep(2000);
        Assert.assertTrue("ERROR no fue creado",mainScreen.isDispledTitle("JBGroup"));
    }

    @After
    public void after() throws MalformedURLException {
        session.getInstance().closeSession();
    }
}
