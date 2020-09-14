package webDriver.hurtMePlentyAndHardcore;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webDriver.hurtMePlentyAndHardcore.pages.CalculatorPage;
import webDriver.hurtMePlentyAndHardcore.pages.EstimatePage;
import webDriver.hurtMePlentyAndHardcore.pages.GoogleCloudPage;

import java.util.concurrent.TimeUnit;

public
class HurtMePlentyTest {
    static WebDriver driver = new ChromeDriver();
    EstimatePage estimatePage = new EstimatePage(driver);

    @BeforeClass
    public static
    void doBeforeTest() {
        GoogleCloudPage googleCloudPage = new GoogleCloudPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://cloud.google.com/");
        googleCloudPage.fillSearchForm("Google Cloud Platform Pricing Calculator");
        googleCloudPage.firstSearchResult.click();
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        driver.switchTo().frame(calculatorPage.frame);
        driver.switchTo().frame(calculatorPage.innerFrame);
        calculatorPage.computerEngine.click();
        calculatorPage.instances.sendKeys("4");
        calculatorPage.instanceFor.sendKeys("");
        calculatorPage.operationSystem.click();
        calculatorPage.freeDebian.click();
        calculatorPage.vmClass.click();
        calculatorPage.regularVMClass.click();
        calculatorPage.instanceType.click();
        calculatorPage.n1standard8.click();
        calculatorPage.addGPUs.click();
        calculatorPage.gpusNumber.click();
        calculatorPage.gpusNumber_1.click();
        calculatorPage.gpusType.click();
        calculatorPage.nvidiaTeslaV100.click();
        calculatorPage.localSSD.click();
        calculatorPage.localSSD2x375.click();
        calculatorPage.location.click();
        calculatorPage.locationFrancfurt.click();
        calculatorPage.commitedUsage.click();
        calculatorPage.commitedUsase1Year.click();
        calculatorPage.addToEstimate.click();
    }

    @Test
    public
    void vmClassTest() {
        Assert.assertTrue("VS Class isn't 'regular'",
                estimatePage.vsClass.getText().contains("regular"));
    }

    @Test
    public
    void instanceTypeTest() {
        Assert.assertTrue("Instance type isn't 'n1-standard-8'",
                estimatePage.instanceType.getText().contains("n1-standard-8"));
    }

    @Test
    public
    void regionTest() {
        Assert.assertTrue("Region isn't Frankfurt",
                estimatePage.region.getText().contains("Frankfurt"));
    }

    @Test
    public
    void localSSDTest() {
        Assert.assertTrue("Local SSD isn't '2x375 GiB'",
                estimatePage.localSSD.getText().contains("2x375 GiB"));
    }

    @Test
    public
    void commitmentTermTest() {
        Assert.assertTrue("Commitment Tem isn't '1 Year'",
                estimatePage.commitmentTerm.getText().contains("1 Year"));
    }

    @Test
    public
    void priceTest() {
        Assert.assertTrue("Estimate cost isn't 'USD 1,082.77 per 1 month'",
                estimatePage.cost.getText().contains("USD 1,082.77 per 1 month"));
    }

    @AfterClass
    public static
    void doAfter() {
        driver.quit();
    }
}
