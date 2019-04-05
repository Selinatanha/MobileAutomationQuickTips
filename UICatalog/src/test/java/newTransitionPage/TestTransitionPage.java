package newTransitionPage;

import TransitionsPage.TransitionsPage;
import UiCatalogPage.UiCatalog;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTransitionPage  extends MobileAPI {


    TransitionsPage transitions;
    @BeforeMethod
    public void navigate(){
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getTransitions();
        transitions = PageFactory.initElements(ad, TransitionsPage.class);
    }
    @Test
    public void testTransitionsPageWhole(){
        transitions.checkTransitionsPageWhole();
    }
    @Test
    public void testTransitionsPageImage(){
        transitions.checkTransitionsPageImages();
    }
    @Test
    public void testTransitionsPageFlipImage(){
        transitions.checkTransitionsPageFlipImages();
    }
    @Test
    public void testTransitionsPageCurlImage(){
        transitions.checkTransitionsPageCurlImages();
    }

}
