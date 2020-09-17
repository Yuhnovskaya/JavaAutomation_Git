package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public
class GoogleCloudPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://cloud.google.com/";
    private final String SEARCH_TEXT="Google Cloud Platform Pricing Calculator";
    @FindBy(xpath = "//input[@aria-label=\"Search box\"]")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@class=\"gsc-expansionArea\"]/div/div/div/div/a")
    public WebElement firstSearchResult;

    public
    String getSEARCH_TEXT() {
        return SEARCH_TEXT;
    }

/*    @Override
    protected
    AbstractPage openPage() {
        driver.navigate().to(PAGE_URL);
        logger.info("Login page opened");
        return this;
    }*/

    @Override
    public
    AbstractPage openPage() {
        driver.navigate().to(PAGE_URL);
        logger.info("Login page opened");
        return this;
    }

    public
    GoogleCloudPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public
    CalculatorPage findInGoogleCloud(String searchText) {
        searchButton.click();
        searchButton.sendKeys(searchText);
        searchButton.submit();
        firstSearchResult.click();
        return new CalculatorPage(driver);
    }
}
