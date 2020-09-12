package webDriver.bringItOn;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webDriver.bringItOn.pages.NewPastePage;
import webDriver.bringItOn.pages.IndexPastebinPage;

import java.util.concurrent.TimeUnit;

public
class TitleSyntaxCodeTextTest {
    static WebDriver driver = new ChromeDriver();
    static IndexPastebinPage pastebinPage = new IndexPastebinPage(driver);
    static NewPastePage newPastePage = new NewPastePage(driver);
    static String code = "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force";
    static String syntax = "Bash";
    static String title = "how to gain dominance among developers";

    @BeforeClass
    public static
    void doBeforeTest() throws InterruptedException {
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
    void verifyTitleTextTest() {
        Assert.assertTrue("The title is not correct", driver.getTitle().contains(title));
    }

    @Test
    public
    void verifySyntaxButtonTextTest() {
        Assert.assertTrue("Syntax is not Bash", newPastePage.syntaxButton.getText().contains(syntax));
    }

    @Test
    public
    void verifyCodeTextTest() {
        Assert.assertEquals("Code is not correct", code, newPastePage.pasteData.getText());
    }

    @AfterClass
    public static
    void doAfterTest() {
        driver.quit();
    }
}
