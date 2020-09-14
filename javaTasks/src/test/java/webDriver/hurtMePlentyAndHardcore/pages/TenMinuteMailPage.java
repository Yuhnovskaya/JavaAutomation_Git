package webDriver.hurtMePlentyAndHardcore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public
class TenMinuteMailPage {
    WebDriver driver;
    @FindBy(xpath="/html/body/div[1]/div/section[1]/div/div[1]/div[1]")
    public WebElement copyEmail;
    @FindBy(xpath="//*[@id=\"mail_messages_content\"]")
    public WebElement mail;
    @FindBy(xpath="//table[@class=\"quote\"]//tr[2]/td[2]/h3")
    public WebElement price;

    public
    TenMinuteMailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
