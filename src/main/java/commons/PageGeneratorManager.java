package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

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

    public static GlobalPageObject getGlobalPage(WebDriver driver) {
        return new GlobalPageObject(driver);
    }
    public static SalesPageObject getSalesPage(WebDriver driver) {
        return new SalesPageObject(driver);
    }

    public static DeliveryPageObject getDeliveryPage(WebDriver driver) {
        return new DeliveryPageObject(driver);
    }

    public static ProjectPageObject getProjectPage(WebDriver driver) {
        return new ProjectPageObject(driver);
    }

    public static TimeSheetPageObject getTimeSheetPage(WebDriver driver) {
        return new TimeSheetPageObject(driver);
    }

    public static RatingPageObject getRatingPage(WebDriver driver) {
        return new RatingPageObject(driver);
    }
}
