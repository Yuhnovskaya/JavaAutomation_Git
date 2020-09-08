package level_2.webDriver.ICanWinAndBringItOn;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public
class BringItOn {
    public static
    void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        PastebinPage pastebinPage = new PastebinPage(driver);
        NewPastePage newPastePage = new NewPastePage(driver);
        String code = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        String syntax = "Bash";
        String title = "how to gain dominance among developers";
        pastebinPage.postForm.sendKeys(code);
        pastebinPage.syntaxHighlighting.click();
        pastebinPage.syntaxSearch.sendKeys(syntax + "\n");
        pastebinPage.pasteExpiration.click();
//pastebinPage.tenMin.click();
        pastebinPage.pasteNameTitle.sendKeys(title);
        pastebinPage.submitButton.click();
        TimeUnit.SECONDS.sleep(10);
        Assert.assertTrue("The title is not correct", driver.getTitle().contains(title));
        Assert.assertTrue("Syntax is not Bash", newPastePage.syntaxButton.getText().contains(syntax));
        Assert.assertEquals("Code is not correct", code, newPastePage.pasteData.getText());
    }
}
