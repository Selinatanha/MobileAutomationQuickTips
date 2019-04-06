package TD;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    WebElement accounts;
    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    WebElement transfer;
    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    WebElement deposit;
    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    WebElement sendMoney;
    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    WebElement product;


    //XCUIElementTypeStaticText[@value = 'Personal Banking']
    //XCUIElementTypeButton
    //XCUIElementTypeOther


    public void UIvalidations() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (accounts.isDisplayed()) {
            System.out.println(accounts.getText() + " : is displayed");
        }
        if (transfer.isDisplayed()) {
            System.out.println(transfer.getText() + " : is displayed");
        }
        if (deposit.isDisplayed()) {
            System.out.println(deposit.getText() + " : is displayed");
        }
        if (sendMoney.isDisplayed()) {
            System.out.println(sendMoney.getText() + " : is displayed");
        }
    }

    /**
     *  This Method will click on Account
     * @Author - Zann
     */

    public void clickOnAccountt() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String account = accounts.getText();
        accounts.click();
        System.out.println(account + ": has been clicked");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            captureScreenshot(ad,"sdbf");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void swipeDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        functionSwipe("up", 200, 200);

    }
}
