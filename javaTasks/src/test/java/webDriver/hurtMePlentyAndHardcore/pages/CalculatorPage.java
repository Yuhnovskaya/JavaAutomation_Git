package webDriver.hurtMePlentyAndHardcore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public
class CalculatorPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"cloud-site\"]/devsite-iframe/iframe")
    public WebElement frame;
    @FindBy(xpath = "//*[@id=\"myFrame\"]")
    public WebElement innerFrame;
    @FindBy(xpath = "//*[@id=\"mainForm\"]/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[1]/div[1]")
    public WebElement computerEngine;
    @FindBy(id = "input_60")
    public WebElement instances;
    @FindBy(id = "input_61")
    public WebElement instanceFor;
    @FindBy(id = "select_value_label_53")
    public WebElement operationSystem;
    @FindBy(id = "select_option_62")
    public WebElement freeDebian;
    @FindBy(id = "select_value_label_54")
    public WebElement vmClass;
    @FindBy(id = "select_option_75")
    public WebElement regularVMClass;
    @FindBy(id = "select_value_label_57")
    public WebElement instanceType;
    @FindBy(xpath="//*[@id = \"select_option_236\"]/div[1]")
    public WebElement n1standard8;
    @FindBy(xpath = "//md-checkbox")
    public WebElement addGPUs;
    @FindBy(id = "select_value_label_370")
    public WebElement gpusNumber;
    @FindBy(id = "select_option_377")
    public WebElement gpusNumber_1;
    @FindBy(id = "select_value_label_371")
    public WebElement gpusType;
    @FindBy(id = "select_option_384")
    public WebElement nvidiaTeslaV100;
    @FindBy(id = "select_value_label_192")
    public WebElement localSSD;
    @FindBy(id = "select_option_257")
    public WebElement localSSD2x375;
    @FindBy(xpath="//*[@id=\"select_value_label_58\"]/span[1]/div")
    public WebElement location;
    @FindBy(xpath = "//*[@id=\"select_option_204\"]/div[contains(text(),\"Frankfurt (europe-west3)\")]")
    public WebElement locationFrancfurt;
    @FindBy(id = "select_value_label_59")
    public WebElement commitedUsage;
    @FindBy(id = "select_option_93")
    public WebElement commitedUsase1Year;
    @FindBy(xpath = "//button[@aria-label=\"Add to Estimate\"]")
    public WebElement addToEstimate;


    public
    CalculatorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
