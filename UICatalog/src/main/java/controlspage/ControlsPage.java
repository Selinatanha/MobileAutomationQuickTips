package controlspage;

import common.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;

public class ControlsPage extends MobileAPI {


    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
    WebElement controls;
    @FindBy(xpath = "//XCUIElementTypeSwitch[@name='Standard']")
    WebElement standardSwitch;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]")
    List<WebElement> allWebElement;
    public void goToControlPage(){
        controls.click();
    }
    public void turnOnStandardSwitch(){
        TestLogger.log( getClass().getSimpleName() + "-> " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName())+ " Standard Switch");
        goToControlPage();
        standardSwitch.click();
        String actual=ad.findElement( By.xpath( "//XCUIElementTypeStaticText[@name='Controls']" ) ).getText();
        System.out.println(actual);
        String expected="Controls";
        Assert.assertEquals( actual,expected );
    }
    public  List<WebElement> getListOfAllWebElement(){
        TestLogger.log( getClass().getSimpleName() + " -> " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName()) +" WebElements");
        goToControlPage();
        List<WebElement> list=ad.findElements( By.xpath( "//XCUIElementTypeNavigationBar[@name=\"Controls\"]" ) );
        System.out.println(list);
        return list;
    }
}
