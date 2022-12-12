package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static OverviewPageObject getOverviewPage(WebDriver driver) {
        return new OverviewPageObject(driver);
    }

    public static SettingPageObject getSettingPage(WebDriver driver) {
        return new SettingPageObject(driver);
    }
}
