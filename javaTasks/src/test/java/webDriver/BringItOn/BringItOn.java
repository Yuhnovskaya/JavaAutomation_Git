package webDriver.BringItOn;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public
class BringItOn {
    static WebDriver driver = new ChromeDriver();
    static PastebinPage pastebinPage = new PastebinPage(driver);
    static NewPastePage newPastePage = new NewPastePage(driver);
    static String code = "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";
    static String syntax = "Bash";
    static String title = "how to gain dominance among developers";

    @BeforeClass
    public static
    void doBefore() throws InterruptedException {
        driver.get("https://pastebin.com");
        pastebinPage.postForm.sendKeys(code);
        pastebinPage.syntaxHighlighting.click();
        pastebinPage.syntaxSearch.sendKeys(syntax + "\n");
//        pastebinPage.pasteExpiration.click();
//        pastebinPage.tenMin.click();
        pastebinPage.pasteNameTitle.sendKeys(title);
        pastebinPage.submitButton.click();
        TimeUnit.SECONDS.sleep(5);
    }

    @Test
    public
    void verifyTitleTest() {
        Assert.assertTrue("The title is not correct", driver.getTitle().contains(title));
    }

    @Test
    public
    void verifySyntaxButtonTextTest() {
        Assert.assertTrue("Syntax is not Bash", newPastePage.syntaxButton.getText().contains(syntax));
    }

    @Test
    public
    void verifyCodeTest() {
        Assert.assertEquals("Code is not correct", code, newPastePage.pasteData.getText());
    }

    @AfterClass
    public static
    void doAfter() {
        driver.quit();
    }
}
