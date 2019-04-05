package settingPage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class SettingPage extends MobileAPI {


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.TextView[1]")
    WebElement themeText;

    public void setThemeText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Theme text");
        boolean select = themeText.isDisplayed();
        Assert.assertTrue(select);
        String text = themeText.getText();
        Assert.assertEquals(text, "THEME");
        boolean select1 = themeText.isEnabled();
        Assert.assertTrue(select1);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch")
    WebElement themeOffTab;

    public void setThemeOffTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Theme Tab");
        String text = themeOffTab.getText();
        Assert.assertEquals(text, "OFF");
        themeOffTab.click();
        boolean select = themeOffTab.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = themeOffTab.isEnabled();
        Assert.assertTrue(select1);
        themeOffTab.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]")
    WebElement darkThemeText;

    public void setDarkThemeText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Dark Theme Text");
        String text = darkThemeText.getText();
        Assert.assertEquals(text, "Dark Theme");
        boolean select = darkThemeText.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = darkThemeText.isEnabled();
        Assert.assertTrue(select1);

    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.TextView[2]")
    WebElement dataSaver;

    public void setDataSaver() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Dark Theme Text");
        String text = dataSaver.getText();
        Assert.assertEquals(text, "DATA SAVER OPTIONS");
        boolean select = dataSaver.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = dataSaver.isSelected();
        Assert.assertFalse(select1);
        boolean select3 = dataSaver.isEnabled();
        Assert.assertTrue(select3);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]")
    WebElement autoFreshText;

    public void setAutoFreshText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Auto Data Refresh Text");
        String text = autoFreshText.getText();
        Assert.assertEquals(text, "Automatic data refresh");
        boolean select = autoFreshText.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = autoFreshText.isEnabled();
        Assert.assertTrue(select1);
        boolean select3 = autoFreshText.isSelected();
        Assert.assertFalse(select3);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]")
    WebElement manualRefresh;

    public void setManualRefresh() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Manual Data Refresh Text");
        String text = manualRefresh.getText();
        Assert.assertEquals(text, "Manual refresh is still available");
        boolean select = manualRefresh.isEnabled();
        Assert.assertTrue(select);
        boolean select1 = manualRefresh.isDisplayed();
        Assert.assertFalse(select1);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch")
    WebElement refreshTab;

    public void setRefreshTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Auto Data Refresh Tab");
        String text = refreshTab.getText();
        Assert.assertEquals(text, "ON");
        boolean select = refreshTab.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = refreshTab.isSelected();
        Assert.assertFalse(select1);
        refreshTab.click();
        String text1 = refreshTab.getText();
        Assert.assertEquals(text1, "OFF");

    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView[1]")
    WebElement loadImage;

    public void setLoadImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Load Image Text");
        String text = loadImage.getText();
        Assert.assertEquals(text, "Load images");
        boolean select = loadImage.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = loadImage.isEnabled();
        Assert.assertTrue(select1);
        boolean select3 = loadImage.isSelected();
        Assert.assertFalse(select3);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView[2]")
    WebElement effectUsage;

    public void setEffectUsage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Effects data usage Text");
        String text = effectUsage.getText();
        Assert.assertEquals(text, "Effects data usage");
        boolean select = effectUsage.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = effectUsage.isSelected();
        Assert.assertFalse(select1);
        boolean select3 = effectUsage.isEnabled();
        Assert.assertTrue(select3);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Switch")
    WebElement loadIMGTab;

    public void setLoadIMGTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Load Image Tab");
        String text = loadIMGTab.getText();
        Assert.assertEquals(text, "ON");
        boolean select = loadIMGTab.isDisplayed();
        Assert.assertTrue(select);
        loadIMGTab.click();
        String text1 = loadIMGTab.getText();
        Assert.assertEquals(text1, "OFF");
        boolean selec1 = loadIMGTab.isEnabled();
        Assert.assertTrue(selec1);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView[1]")
    WebElement lowQualityText;

    public void setLowQualityText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Load Image Tab");
        String text = lowQualityText.getText();
        Assert.assertEquals(text, "");
        boolean select = lowQualityText.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = lowQualityText.isSelected();
        Assert.assertFalse(select1);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView[2]")
    WebElement videoStreamingText;

    public void setVideoStreamingText() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Load Image Tab");
        String text = videoStreamingText.getText();
        Assert.assertEquals(text, "Save data on video streaming");
        boolean select = videoStreamingText.isDisplayed();
        Assert.assertTrue(select);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android." +
            "support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget." +
            "LinearLayout/android.widget.Switch")
    WebElement lowQualityTab;

    public void setLowQualityTab() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Low Quality Video Tab");
        String text = lowQualityTab.getText();
        Assert.assertEquals(text, "OFF");
        boolean select = lowQualityTab.isDisplayed();
        Assert.assertTrue(select);
        lowQualityTab.click();
        String text1 = lowQualityTab.getText();
        Assert.assertEquals(text1, "ON");
        boolean selcct1 = lowQualityTab.isEnabled();
        Assert.assertTrue(selcct1);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android." +
            "widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.TextView[2]")
    WebElement videoOptions;

    public void setVideoOptionstext() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Video Options text)");
        String text = videoOptions.getText();
        Assert.assertEquals(text, "VIDEO OPTIONS");
        boolean select = videoOptions.isDisplayed();
        Assert.assertTrue(select);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.TextView[1]")
    WebElement videoLanguage;

    public void setVideoLanguage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test Video Language text)");
        String text = videoLanguage.getText();
        Assert.assertEquals(text, "Video Language");
        boolean select = videoLanguage.isDisplayed();
        Assert.assertTrue(select);
    }

    @FindBy(xpath = "")
    WebElement notificationsText;

    public void setNotificationsText(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Test NOTIFICATIONS text)");
        String text = notificationsText.getText();
        Assert.assertEquals(text,"NOTIFICATIONS");
        boolean select = notificationsText.isDisplayed();
        Assert.assertTrue(select);
        boolean select1 = notificationsText.isEnabled();
        Assert.assertTrue(select1);
    }
}
