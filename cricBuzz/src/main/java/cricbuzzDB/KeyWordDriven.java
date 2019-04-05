package cricbuzzDB;

import common.MobileAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class KeyWordDriven extends MobileAPI {

    ConnectToSqlDB connect = new ConnectToSqlDB();

    /************************/

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.ImageView")
    WebElement logo;

    public void setLogo() {
        boolean select = logo.isDisplayed();
        Assert.assertTrue(select);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView")
    WebElement clickOnSetting;

    public void setClickOnSetting() {
        boolean select = clickOnSetting.isEnabled();
        Assert.assertTrue(select);
        boolean select1 = clickOnSetting.isDisplayed();
        Assert.assertTrue(select1);
        clickOnSetting.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")
    WebElement featureMatches;

    public void setFeatureMatches() {
        String text = featureMatches.getText();
        Assert.assertEquals(text, "FEATURED MATCHES");
        boolean select = featureMatches.isDisplayed();
        Assert.assertTrue(select);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")
    WebElement topStories;

    public void setTopStories() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Top Stories");
        Actions actions = new Actions(ad);
        actions.moveToElement(topStories);
    }

    String str = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[6]";

    public void setBottomIPL() throws Exception {
        sleep(3);
        ad.scrollTo(str);
        scrollToElement(ad, str);
    }

    /**********************/

    public List<String> getItemsListFromDB() throws Exception {
        List<String> list = new ArrayList<String>();
        list = connect.readDataBase("keywords", "keyMobile");
        return list;
    }

    public void readMysql() throws Exception {
        for (String keyWords : getItemsListFromDB()) {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + keyWords);
            switch (keyWords) {
                case "setting":
                    setClickOnSetting();
                    sleep(3);
                    break;
                case "topStories":
                    setLogo();
                    sleep(3);
                    break;
                case "scrolling":
                    setTopStories();
                    sleep(3);
                    break;
                case "moving":
                    setBottomIPL();
                    sleep(3);
                    break;
                case "testNews":
                    setFeatureMatches();
            }
        }
    }
}
