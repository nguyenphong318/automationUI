import commons.BaseTest;
import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPageObject;
import pageObjects.OverviewPageObject;
import commons.PageGeneratorManager;
import pageObjects.ProjectPageObject;
import pageObjects.SettingPageObject;

public class LogInTest extends BaseTest {
    String urlPage;
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    LoginPageObject loginPage;
    OverviewPageObject overviewPage;
    SettingPageObject settingPage;

    @Parameters({"browser"})
    @BeforeClass
    public void beforeClass(String browser) {
        this.urlPage = GlobalConstants.DEV_URL;
        driver = setBrowserDriver("chrome", this.urlPage);
        loginPage = PageGeneratorManager.getLoginPage(driver);
    }

    @Test
    public void TC_01_LoginWithEmptyUserNameAndPassword() {
//        loginPage.inputToUsernameTextbox(" ");
//        loginPage.inputToPasswordTextbox(" ");
        log.info("Login 01: Step 01: Click To Login Button");
        loginPage.clickToLoginButton();
        String emptyErrorMessage = loginPage.getErrorMessage();

        log.info("Login 01: Step 02: Verify error mesage is displayed");
        Assert.assertEquals(emptyErrorMessage, "Request not valid!", "Verify error message is correct");
    }

    @Test
    public void TC_02_LoginWithInvalidUserName() {
        log.info("Login 02: Step 01: Refresh Current Page");
        loginPage.refreshPage();

        log.info("Login 02: Step 02: Input To Username Textbox");
        loginPage.inputToUsernameTextbox("ntthao1234");

        log.info("Login 02: Step 03: Input To Password Textbox");
        loginPage.inputToPasswordTextbox("123");

        log.info("Login 02: Step 04: Click To Login Button");
        loginPage.clickToLoginButton();

        String emptyErrorMessage = loginPage.getErrorMessage();
        log.info("Login 02: Step 05: Verify Error Message Is Displayed");
        Assert.assertEquals(emptyErrorMessage, "User not found!", "Verify error message is correct");
    }

    @Test
    public void TC_03_LoginWithInvalidPassword() {
        log.info("Login 03: Step 01: Refresh Current Page");
        loginPage.refreshPage();

        log.info("Login 03: Step 02: Input To Username Textbox");
        loginPage.inputToUsernameTextbox("ntthao12");

        log.info("Login 03: Step 03: Input To Password Textbox");
        loginPage.inputToPasswordTextbox("1234");

        log.info("Login 03: Step 04: Click To Login Button");
        loginPage.clickToLoginButton();

        log.info("Login 04: Step 05: Verify Error Message Is Displayed");
        String emptyErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(emptyErrorMessage, "Username and password is not valid!", "Verify error message is correct");
    }

    @Test
    public void TC_04_LoginWithValidUsernameAndPassword() {
        log.info("Login 04: Step 01: Refresh Current Page");
        loginPage.refreshPage();

        log.info("Login 04: Step 02: Input To Username Textbox");
        loginPage.inputToUsernameTextbox(GlobalConstants.ADMIN_USERNAME);

        log.info("Login 04: Step 03: Input To Password Textbox");
        loginPage.inputToPasswordTextbox(GlobalConstants.ADMIN_PASSWORD);

        log.info("Login 04: Step 04: Click To Login Button");
        overviewPage = loginPage.clickToLoginButton();

        log.info("Login 04: Step 05: Verify Log In Success");
        Assert.assertTrue(overviewPage.isOverViewDisplayed("Overview"), "Verify log in successfully");
    }

    @Test
    public void TC_05_NavigateToSettingPage() {
        overviewPage.openHeaderLinkByPageName("SETTING");
        settingPage = PageGeneratorManager.getSettingPage(driver);
        sleepInSecond(3);
        settingPage.openHeaderLinkByPageName("PROJECTS");
        ProjectPageObject projectPage = PageGeneratorManager.getProjectPage(driver);
        sleepInSecond(3);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
