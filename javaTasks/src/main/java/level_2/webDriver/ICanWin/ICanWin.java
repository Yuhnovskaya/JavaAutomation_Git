package level_2.webDriver.ICanWin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public
class ICanWin {
    public static
    void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pastebin.com");
        PastebinPage pastebinPage = new PastebinPage(driver);
        pastebinPage.postForm.sendKeys("Hello from WebDriver");
//pastebinPage.pasteExpiration.click();
//pastebinPage.tenMin.click();
        pastebinPage.pasteNameTitle.sendKeys("helloweb");
        pastebinPage.submitButton.click();
        driver.quit();
    }
}
