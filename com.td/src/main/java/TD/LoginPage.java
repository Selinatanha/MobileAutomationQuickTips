package TD;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MobileAPI {

    @FindBy(xpath = "//android.widget.Button[@text='Forgot your password?']")
    WebElement forgotPass;

    @FindBy(xpath = "//android.widget.EditText[@text='User name']")
    WebElement userName;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    WebElement pass;

    public void clickForgotPass(){
        forgotPass.click();
    }

    public void fillUsernamePass(){
    userName.sendKeys("abcd1234");
    pass.sendKeys("123456");
    }
}
