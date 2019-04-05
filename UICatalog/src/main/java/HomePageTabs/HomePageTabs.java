package HomePageTabs;

import common.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePageTabs extends MobileAPI {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    WebElement button;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
    WebElement controls;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
    WebElement textField;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
    WebElement searchBar;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]")
    WebElement textView;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]")
    WebElement pickers;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]")
    WebElement images;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]")
    WebElement web;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]")
    WebElement segments;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]")
    WebElement toolbar;
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]")
    WebElement alerts;
    public void selectButton(){
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        button.click();
    }
    public void selectControls(){
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        controls.click();
    }public void selectTextField(){
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        textField.click();
    }
    public void selectSearchbar(){
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        searchBar.click();
    }
    public void selectAlerts(){
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        alerts.click();
    }
    public void selectTextView(){
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        textView.click();
    }
    public void selectPickers(){
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        pickers.click();
    }
    public void selectImages(){
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        images.click();
    }
    public void selectWeb(){
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        web.click();
    }
    public void selectToolbars(){
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        toolbar.click();
    }
    public void selectSegments(){
        TestLogger.log( getClass().getSimpleName() + ": " + convertToString( new Object() {
        }.getClass().getEnclosingMethod().getName() ) );
        segments.click();
        String actual =ad.findElement( By.xpath("//XCUIElementTypeStaticText[@name='UISegmentControlStyleBordered:']") ).getText();
        System.out.println(actual);
        String expected = "UISegmentControlStyleBordered:";
        Assert.assertEquals( actual,expected );
    }

}
