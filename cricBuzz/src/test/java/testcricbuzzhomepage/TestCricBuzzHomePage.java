package testcricbuzzhomepage;

import common.MobileAPI;
import cricbuzzhomepage.CricBuzzHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCricBuzzHomePage extends MobileAPI {

   CricBuzzHomePage homePage;

    @BeforeMethod
    public void init(){
        homePage = PageFactory.initElements(ad,CricBuzzHomePage.class);
    }
    @Test
    public void testLogo(){
        homePage.setLogo();
    }
    @Test
    public void testSettingBtn(){
        homePage.setClickOnSetting();
    }
    @Test
    public void testFeatureMatches(){
    homePage.setFeatureMatches();
    }
    @Test
    public void testTopStories(){
        homePage.setTopStories();
    }
    @Test
    public void testScrollingToBottom()throws Exception{
        homePage.setBottomIPL();
    }




}
