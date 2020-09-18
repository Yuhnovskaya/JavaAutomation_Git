package test;

import model.Product;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.CalculatorPage;
import page.GoogleCloudPage;
import page.TenMinuteMailPage;
import service.ProductCreator;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public
class HardcoreTest extends CommonConditions {
    @Test
    public
    void hardcoreTest() throws InterruptedException {
        Product testProduct = ProductCreator.computerEngine();
        GoogleCloudPage googleCloudPage = new GoogleCloudPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        TenMinuteMailPage tenMinuteMailPage = new TenMinuteMailPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        googleCloudPage.openPage();
        googleCloudPage.findInGoogleCloud(googleCloudPage.getSEARCH_TEXT());
        calculatorPage.swithToWorkingFrame();
        calculatorPage.selectProduct(testProduct.getProductType());
        calculatorPage.enterInstancesNumber(Integer.parseInt(testProduct.getInstanceNumber()));
        calculatorPage.enterInstanceFor(testProduct.getInstanceFor());
        calculatorPage.selectOperationSystem(testProduct.getOperationSystem());
        calculatorPage.selectVMClass(testProduct.getVmClass());
        calculatorPage.selectInstanceType(testProduct.getInstanceType());
        if (testProduct.isAddGPUs()) {
            calculatorPage.selectAddingGPUs();
            calculatorPage.selectGPUsNumber(Integer.parseInt(testProduct.getGpusNUmber()));
            calculatorPage.selectGPUsType(testProduct.getGpusType());
        }
        calculatorPage.selectLocalSSD(testProduct.getLocalSSD());
        calculatorPage.selectLocation(testProduct.getLocation());
        calculatorPage.selectCommittedUsage(testProduct.getCommitedUsage());
        calculatorPage.calculateSelection();
        String totalCost = calculatorPage.getTotalCost();
        calculatorPage.emailEstimate();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(String.format("window.open('%s')", tenMinuteMailPage.getPAGE_URL()));
        ArrayList handles = new ArrayList(driver.getWindowHandles());
        String calculatorHandle = String.valueOf(handles.get(0));
        String mailHandle = String.valueOf(handles.get(1));
        driver.switchTo().window(mailHandle);
        TimeUnit.SECONDS.sleep(5);
        //js.executeScript("arguments[0].click();", tenMinuteMailPage.copyEmail);
        tenMinuteMailPage.getEmailAddress();
        driver.switchTo().window(calculatorHandle);
        calculatorPage.swithToWorkingFrame();
        calculatorPage.pasteEmail();
        calculatorPage.sendEmail();
        driver.switchTo().window(mailHandle);
        TimeUnit.SECONDS.sleep(40);
        /*WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(tenMinuteMailPage.mail));*/
        tenMinuteMailPage.readEmail();
        String priceInMail = tenMinuteMailPage.getPrice();
        Assert.assertTrue(totalCost.contains(priceInMail));
    }
}
