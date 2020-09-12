package webDriver.hurtMePlenty.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public
class EstimatePage {
    WebDriver driver;
    @FindBy(xpath = "//*[contains(text(),\"VM class\")]")
    public WebElement vsClass;
    @FindBy(xpath = "//*[contains(text(),\"Instance type\")]")
    public WebElement instanceType;
    @FindBy(xpath = "//div[contains(text(),\"Region\")]")
    public WebElement region;
    @FindBy(xpath = "//*[contains(text(),\"local SSD\")]")
    public WebElement localSSD;
    @FindBy(xpath = "//*[contains(text(),\"Commitment term\")]")
    public WebElement commitmentTerm;
    @FindBy(xpath = "//b[@class=\"ng-binding\"]")
    public WebElement cost;

    public
    EstimatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
