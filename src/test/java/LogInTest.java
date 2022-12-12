import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPageObject;
import pageObjects.OverviewPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.SettingPageObject;

import java.util.concurrent.TimeUnit;

public class LogInTest extends BaseTest {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    LoginPageObject loginPage;
    OverviewPageObject overviewPage;
    SettingPageObject settingPage;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass() {
        driver = setBrowserDriver("chrome");
        loginPage = PageGeneratorManager.getLoginPage(driver);
    }

    @Test
    public void TC_01_LoginWithEmptyUserNameAndPassword() {
//        loginPage.inputToUsernameTextbox(" ");
//        loginPage.inputToPasswordTextbox(" ");
        loginPage.clickToLoginButton();
        String emptyErrorMessage = loginPage.getErrorMessage();
        System.out.println(emptyErrorMessage);
        Assert.assertEquals(emptyErrorMessage, "Request not valid!", "Verify error message is correct");
    }

    @Test
    public void TC_02_LoginWithInvalidUserName() {
        loginPage.refreshPage();
        loginPage.inputToUsernameTextbox("ntthao1234");
        loginPage.inputToPasswordTextbox("123");
        loginPage.clickToLoginButton();
        String emptyErrorMessage = loginPage.getErrorMessage();
        System.out.println(emptyErrorMessage);
        Assert.assertEquals(emptyErrorMessage, "User not found!", "Verify error message is correct");
    }

    @Test
    public void TC_03_LoginWithInvalidPassword() {
        loginPage.refreshPage();
        loginPage.inputToUsernameTextbox("ntthao12");
        loginPage.inputToPasswordTextbox("1234");
        loginPage.clickToLoginButton();
        String emptyErrorMessage = loginPage.getErrorMessage();
        System.out.println(emptyErrorMessage);
        Assert.assertEquals(emptyErrorMessage, "Username and password is not valid!", "Verify error message is correct");
    }

    @Test
    public void TC_04_LoginWithValidUsernameAndPassword() {
        loginPage.refreshPage();
        loginPage.inputToUsernameTextbox("ntthao12");
        loginPage.inputToPasswordTextbox("123");
        overviewPage = loginPage.clickToLoginButton();
        Assert.assertTrue(overviewPage.isOverViewDisplayed("Overview"), "Verify log in successfully");
    }

    @Test
    public void TC_05_NavigateToSettingPage() {
        settingPage = overviewPage.openSettingPage(driver);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
