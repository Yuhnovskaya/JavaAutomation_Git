package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public
class CalculatorPage extends AbstractPage {
    private final String PRODUCT = "//*[@class=\"md-paginated\"]//*[@title=\"%s\"]";
    private final String OPERATION_SYSTEM = "//*[@id=\"select_container_74\"]//*[contains(text(),\"%s\")]";
    private final String VM_CLASS = "//*[@id=\"select_container_78\"]//*[contains(text(),\"%s\")]";
    private final String INSTANCE_TYPE = "//*[@id=\"select_container_87\"]//*[contains(text(),\"%s\")]";
    private final String GPUS_NUMBER = "//*[@id=\"select_container_373\"]//*[contains(@value,\"%s\")]";
    private final String GPUS_TYPE = "//*[@id=\"select_container_375\"]//*[contains(text(),\"%s\")]";
    private final String LOCAL_SSD = "//*[@id=\"select_container_194\"]//*[contains(text(),\"%s\")]";
    private final String LOCATION = "//*[@id=\"select_container_89\"]//*[contains(text(),\"%s\")]";
    private final String COMMITTED_USAGE = "//*[@id=\"select_container_96\"]//*[contains(text(),\"%s\")]";

    @FindBy(xpath = "//*[@id=\"cloud-site\"]/devsite-iframe/iframe")
    public WebElement frame;
    @FindBy(xpath = "//*[@id=\"myFrame\"]")
    public WebElement innerFrame;
    @FindBy(id = "input_60")
    private WebElement instancesField;
    @FindBy(id = "input_61")
    private WebElement instanceForField;
    @FindBy(id = "select_value_label_53")
    public WebElement operationSystemField;
    @FindBy(id = "select_value_label_54")
    public WebElement vmClassField;
    @FindBy(id = "select_value_label_57")
    public WebElement instanceTypeField;
    @FindBy(xpath = "//md-checkbox")
    public WebElement addGPUs;
    @FindBy(id = "select_value_label_370")
    public WebElement gpusNumberField;
    @FindBy(id = "select_value_label_371")
    public WebElement gpusTypeField;
    @FindBy(id = "select_value_label_192")
    public WebElement localSSDField;
    @FindBy(xpath = "//*[@id=\"select_value_label_58\"]/span[1]/div")
    public WebElement locationField;
    @FindBy(id = "select_value_label_59")
    public WebElement committedUsageField;
    @FindBy(xpath = "//button[@aria-label=\"Add to Estimate\"]")
    public WebElement addToEstimate;
    @FindBy(xpath = "//b[@class=\"ng-binding\"]")
    public WebElement cost;
    @FindBy(id = "email_quote")
    public WebElement emailEstimate;
    @FindBy(xpath = "//input[@ng-model=\"emailQuote.user.email\"]")
    public WebElement emailField;
    @FindBy(xpath = "//button[@aria-label=\"Send Email\"]")
    public WebElement sendEmailButton;

    @Override
    public
    AbstractPage openPage() {
        return this;
    }

    public
    CalculatorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public
    CalculatorPage enterInstancesNumber(int instancesNumber) {
        instancesField.sendKeys(String.valueOf(instancesNumber));
        return this;
    }

    public
    CalculatorPage enterInstanceFor(String string) {
        instanceForField.sendKeys(string);
        return this;
    }

    public
    CalculatorPage selectOperationSystem(String operationSystem) {
        operationSystemField.click();
        driver.findElement(By.xpath(String.format(OPERATION_SYSTEM, operationSystem))).click();
        return this;
    }

    public
    CalculatorPage selectVMClass(String vmClass) {
        vmClassField.click();
        driver.findElement(By.xpath(String.format(VM_CLASS, vmClass))).click();
        return this;
    }

    public
    CalculatorPage selectInstanceType(String instanceType) throws InterruptedException {
        instanceTypeField.click();
        TimeUnit.MILLISECONDS.sleep(100);
        driver.findElement(By.xpath(String.format(INSTANCE_TYPE, instanceType))).click();
        return this;
    }

    public
    CalculatorPage selectGPUsNumber(int gpusNumber) {
        gpusNumberField.click();
        driver.findElement(By.xpath(String.format(GPUS_NUMBER, gpusNumber))).click();
        return this;
    }

    public
    CalculatorPage selectGPUsType(String gpusType) throws InterruptedException {
        gpusTypeField.click();
        TimeUnit.MILLISECONDS.sleep(100);
        driver.findElement(By.xpath(String.format(GPUS_TYPE, gpusType))).click();
        return this;
    }

    public
    CalculatorPage selectLocalSSD(String localSSD) throws InterruptedException {
        localSSDField.click();
        TimeUnit.MILLISECONDS.sleep(100);
        driver.findElement(By.xpath(String.format(LOCAL_SSD, localSSD))).click();
        return this;
    }

    public
    CalculatorPage selectLocation(String location) throws InterruptedException {
        locationField.click();
        TimeUnit.MILLISECONDS.sleep(300);
        driver.findElement(By.xpath(String.format(LOCATION, location))).click();
        return this;
    }

    public
    CalculatorPage selectCommittedUsage(String committedUsage) throws InterruptedException {
        committedUsageField.click();
        driver.findElement(By.xpath(String.format(COMMITTED_USAGE, committedUsage))).click();
        return this;
    }

    public
    CalculatorPage swithToWorkingFrame() {
        driver.switchTo().frame(frame);
        driver.switchTo().frame(innerFrame);
        return this;
    }

    public
    CalculatorPage selectProduct(String product) {
        driver.findElement(By.xpath(String.format(PRODUCT, product)));
        return this;
    }

    public
    CalculatorPage selectAddingGPUs() {
        addGPUs.click();
        return this;
    }

    public
    CalculatorPage calculateSelection() {
        addToEstimate.click();
        return this;
    }

    public
    String getTotalCost() {
        return cost.getText();
    }

    public
    CalculatorPage pasteEmail() {
        emailField.sendKeys(Keys.CONTROL, "v");
        return this;
    }

    public
    CalculatorPage emailEstimate() {
        emailEstimate.click();
        return this;
    }

    public
    CalculatorPage sendEmail() {
        sendEmailButton.click();
        return this;
    }
}
