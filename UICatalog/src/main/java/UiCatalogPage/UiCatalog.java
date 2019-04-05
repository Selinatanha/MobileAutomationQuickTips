package UiCatalogPage;

import AlertsPage.Alerts;
import ButtonsPage.ButtonPage;
import ImagesPage.ImagesPage;
import PickersPage.PickerPage;
import SearchBarPage.SearchBarPage;
import SegmentsPage.SegmentsPage;
import TextFieldsPage.TextFieldsPage;
import TextViewPage.TextViewPage;
import ToolbarPage.ToolBarPage;
import TransitionsPage.TransitionsPage;
import WebPage.WebPage;
import common.MobileAPI;
import controlspage.ControlsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 1/15/17.
 */
public class UiCatalog extends MobileAPI {

    List<WebElement> elements = new ArrayList<WebElement>();

    public void page() {
        //store mobile elements into ArrayList
        elements = ad.findElements(By.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell"));
    }

    public ButtonPage getButtonPage() {
        page();
        elements.get(0).click();
        return new ButtonPage();
    }

    public ControlsPage getControls() {
        page();
        elements.get(1).click();
        return new ControlsPage();
    }

    public TextFieldsPage getTextFields() {
        page();
        elements.get(2).click();
        return new TextFieldsPage();
    }

    public SearchBarPage getSearchBar() {
        page();
        elements.get(3).click();
        return new SearchBarPage();
    }

    public TextViewPage getTextView() {
        page();
        elements.get(4).click();
        return new TextViewPage();
    }

    public PickerPage getPickers() {
        page();
//        elements.get(5).click();
        String str = elements.get(5).getText();
        System.out.println(str);
        return new PickerPage();
    }

    public ImagesPage getImages() {
        page();
        elements.get(6).click();
        return new ImagesPage();
    }

    public WebPage getWeb() {
        page();
        elements.get(7).click();
        return new WebPage();
    }

    public SegmentsPage getSegments() {
        page();
        elements.get(8).click();
        return new SegmentsPage();
    }

    public ToolBarPage getToolbar() {
        page();
        elements.get(9).click();
        return new ToolBarPage();
    }

    public Alerts getAlerts() {
        page();
        elements.get(10).click();
        return new Alerts();
    }

    public TransitionsPage getTransitions() {
        page();
        elements.get(11).click();
        return new TransitionsPage();
    }

}