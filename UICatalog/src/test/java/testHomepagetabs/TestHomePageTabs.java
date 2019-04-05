package testHomepagetabs;

import HomePageTabs.HomePageTabs;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePageTabs extends MobileAPI {

    HomePageTabs homePage;

    @BeforeMethod
    public void init(){
        homePage= PageFactory.initElements( ad,HomePageTabs.class );
    }
    @Test
    public void testSelectButton(){
        homePage.selectButton();
    }
    @Test
    public void testSelectControls(){
        homePage.selectControls();
    }
    @Test
    public void testSelectTextField(){
        homePage.selectTextField();
    }
    @Test
    public void testSelectSearchbar(){
        homePage. selectSearchbar();
    }
    @Test
    public void testSelectAlerts(){
        homePage.selectAlerts();
    }
    @Test
    public void testSelectTextView(){
        homePage.selectTextView();
    }
    @Test
    public void testSelectPickers(){
        homePage.selectPickers();
    }
    @Test
    public void testSelectImages(){
        homePage.selectImages();
    }
    @Test
    public void testSelectWeb(){
        homePage.selectWeb();
    }
    @Test
    public void testSelectToolbars(){
        homePage.selectToolbars();
    }
    @Test
    public void testSelectSegments(){
        homePage.selectSegments();
    }

}
