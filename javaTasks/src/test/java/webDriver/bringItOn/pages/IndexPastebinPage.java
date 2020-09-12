package webDriver.bringItOn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public
class IndexPastebinPage {
    WebDriver driver;
    @FindBy(id = "postform-text")
    public WebElement postForm;
    @FindBy(xpath = "//*[@id=\"w0\"]/div[5]/div[1]/div[2]/div/span/span[1]/span/span[2]")
    public WebElement pasteExpiration;
    @FindBy(xpath = "//*[@id=\"postform-expiration\"]/option[2]")
    public WebElement tenMin;
    @FindBy(id = "postform-name")
    public WebElement pasteNameTitle;
    @FindBy(xpath = "//*[@id=\"w0\"]/div[5]/div[1]/div[6]/button")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@data-select2-id=\"1\"]")
    public WebElement syntaxHighlighting;
    @FindBy(xpath = "//*[contains(@class,'select2')]/input")
    public WebElement syntaxSearch;

    public
    IndexPastebinPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
