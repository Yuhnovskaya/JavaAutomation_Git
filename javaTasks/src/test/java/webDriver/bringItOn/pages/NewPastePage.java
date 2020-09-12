package webDriver.bringItOn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public
class NewPastePage {
    WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/a")
    public WebElement syntaxButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/textarea")
    public WebElement pasteData;

    public
    NewPastePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
