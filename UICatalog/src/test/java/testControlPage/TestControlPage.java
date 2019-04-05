package testControlPage;

import common.MobileAPI;
import controlspage.ControlsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestControlPage extends MobileAPI {

    ControlsPage page;
    @BeforeMethod
    public void initializing(){
        page= PageFactory.initElements( ad,ControlsPage.class );
    }
    @Test
    public void testTurnOnStandardSwitch(){
        page.turnOnStandardSwitch();
    }
    @Test
    public void testGetAllWebElements(){
        page.getListOfAllWebElement();
    }
}
