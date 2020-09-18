package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public
class TenMinuteMailPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://10minutemail.com";
    @FindBy(xpath = "//*[@id=\"copy_address\"]")
    public WebElement copyEmail;
    @FindBy(xpath = "//*[@id=\"mail_messages_content\"]")
    public WebElement mail;
    @FindBy(xpath = "//table[@class=\"quote\"]//tr[2]/td[2]/h3")
    public WebElement price;

    @Override
    public
    AbstractPage openPage() {
        driver.navigate().to(PAGE_URL);
        logger.info("Login page opened");
        return this;
    }

    public
    TenMinuteMailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public
    TenMinuteMailPage getEmailAddress() {
        copyEmail.click();
        return this;
    }

    public
    TenMinuteMailPage readEmail() {
        mail.click();
        return this;
    }

    public
    String getPrice() {
        return price.getText();
    }

    public
    String getPAGE_URL() {
        return PAGE_URL;
    }
}
