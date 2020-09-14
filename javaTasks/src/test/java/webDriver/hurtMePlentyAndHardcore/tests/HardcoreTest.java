package webDriver.hurtMePlentyAndHardcore.tests;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webDriver.hurtMePlentyAndHardcore.pages.CalculatorPage;
import webDriver.hurtMePlentyAndHardcore.pages.EstimatePage;
import webDriver.hurtMePlentyAndHardcore.pages.GoogleCloudPage;
import webDriver.hurtMePlentyAndHardcore.pages.TenMinuteMailPage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public
class HardcoreTest {
    WebDriver driver;
    String totalCost;
    String costInMail;

    @Before
    public
    void doBefore() throws InterruptedException {
        driver = new ChromeDriver();
        TenMinuteMailPage tenMinuteMailPage = new TenMinuteMailPage(driver);
        GoogleCloudPage googleCloudPage = new GoogleCloudPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        EstimatePage estimatePage = new EstimatePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://cloud.google.com/");
        googleCloudPage.fillSearchForm("Google Cloud Platform Pricing Calculator");
        googleCloudPage.firstSearchResult.click();
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
        TimeUnit.MILLISECONDS.sleep(500);
        calculatorPage.n1standard8.click();
        calculatorPage.addGPUs.click();
        calculatorPage.gpusNumber.click();
        calculatorPage.gpusNumber_1.click();
        calculatorPage.gpusType.click();
        TimeUnit.MILLISECONDS.sleep(500);
        calculatorPage.nvidiaTeslaV100.click();
        calculatorPage.localSSD.click();
        calculatorPage.localSSD2x375.click();
        calculatorPage.location.click();
        TimeUnit.MILLISECONDS.sleep(500);
        calculatorPage.locationFrancfurt.click();
        calculatorPage.commitedUsage.click();
        calculatorPage.commitedUsase1Year.click();
        calculatorPage.addToEstimate.click();
        estimatePage.emailEstimate.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://10minutemail.com')");
        ArrayList handles = new ArrayList(driver.getWindowHandles());
        String calculatorHandle = String.valueOf(handles.get(0));
        String tenminmailHandle = String.valueOf(handles.get(1));
        driver.switchTo().window(tenminmailHandle);
        TimeUnit.SECONDS.sleep(3);
        tenMinuteMailPage.copyEmail.click();
        driver.switchTo().window(calculatorHandle);
        driver.switchTo().frame(calculatorPage.frame);
        driver.switchTo().frame(calculatorPage.innerFrame);
        totalCost = estimatePage.cost.getText();
        estimatePage.emailField.sendKeys(Keys.CONTROL, "v");
        estimatePage.sendEmailButton.click();
        driver.switchTo().window(tenminmailHandle);
        //TimeUnit.SECONDS.sleep(20);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(tenMinuteMailPage.mail));
        tenMinuteMailPage.mail.click();
        costInMail = tenMinuteMailPage.price.getText();
        System.out.println(totalCost);
        System.out.println(costInMail);
    }

    @Test
    public
    void hardcoreTest() {
        Assert.assertTrue("Costs aren't equal",totalCost.contains(costInMail));
    }

    @After
    public
    void doAfte() {
        driver.close();
        driver.quit();
    }
}
