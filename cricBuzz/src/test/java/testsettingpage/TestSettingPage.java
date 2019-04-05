package testsettingpage;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settingPage.SettingPage;

public class TestSettingPage extends MobileAPI {

    SettingPage setting;

    @BeforeMethod
    public void init(){
        setting = PageFactory.initElements(ad,SettingPage.class);
    }

    @Test
    public void testSettingTheme(){
        setting.setThemeText();
    }

    @Test
    public void testThemeOffTab(){
        setting.setThemeOffTab();
    }

    @Test
    public void testDarkhemeOffTab(){
        setting.setDarkThemeText();
    }

    @Test
    public void testDataSaver(){
        setting.setDataSaver();
    }

    @Test
    public void testAutoFreshText(){
        setting.setAutoFreshText();
    }

    @Test
    public void testManualRefresh(){
        setting.setManualRefresh();
    }
    @Test
    public void testsetRefreshTab(){
        setting.setRefreshTab();
    }

    @Test
    public void testLoadImage(){
        setting.setLoadImage();
    }

    @Test
    public void testEffectUsage(){
        setting.setEffectUsage();
    }

    @Test
    public void testLoadIMGTab(){
        setting.setLoadIMGTab();
    }

    @Test
    public void testLowQualityText(){
        setting.setLowQualityText();
    }

    @Test
    public void testVideoStreamingText(){
        setting.setVideoStreamingText();
    }

    @Test
    public void testsetLowQualityTab(){
        setting.setLowQualityTab();
    }

    @Test
    public void testVideoOptionstext(){
        setting.setVideoOptionstext();
    }

    @Test
    public void testVideoLanguage(){
        setting.setVideoLanguage();
    }

    @Test
    public void testNotificationsText(){
        setting.setNotificationsText();
    }
}
