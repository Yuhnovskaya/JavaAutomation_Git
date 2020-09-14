package webDriver.hurtMePlentyAndHardcore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public
class GoogleCloudPage {
    WebDriver driver;
    @FindBy(xpath = "//input[@aria-label='Search box']")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@class=\"gsc-expansionArea\"]/div/div/div/div/a")
    public WebElement firstSearchResult;


    public
    GoogleCloudPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public
    void fillSearchForm(String searchText) {
        searchButton.click();
        searchButton.sendKeys(searchText);
        searchButton.submit();
    }

}
