package pageObjects.navigation;

import commons.BasePage;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pageObjects.*;
import pageUIs.navigation.HeaderPageUI;

public class HeaderNavigationPageObject extends BasePage {
    WebDriver driver;

    public HeaderNavigationPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public SettingPageObject openSettingPage() {
        waitForElementClickable(driver, HeaderPageUI.SETTING_LINK);
        clickToElement(driver, HeaderPageUI.SETTING_LINK);
        return PageGeneratorManager.getSettingPage(driver);
    }

    public GlobalPageObject openGlobalPage() {
        waitForElementClickable(driver, HeaderPageUI.GLOBAL_LINK);
        clickToElement(driver, HeaderPageUI.GLOBAL_LINK);
        return PageGeneratorManager.getGlobalPage(driver);
    }

    public SalesPageObject openSalesPage() {
        waitForElementClickable(driver, HeaderPageUI.SALES_LINK);
        clickToElement(driver, HeaderPageUI.SALES_LINK);
        return PageGeneratorManager.getSalesPage(driver);
    }

    public DeliveryPageObject openDeliveryPage() {
        waitForElementClickable(driver, HeaderPageUI.DELIVERY_LINK);
        clickToElement(driver, HeaderPageUI.DELIVERY_LINK);
        return PageGeneratorManager.getDeliveryPage(driver);
    }

    public ProjectPageObject openProjectPage() {
        waitForElementClickable(driver, HeaderPageUI.PROJECTS_LINK);
        clickToElement(driver, HeaderPageUI.PROJECTS_LINK);
        return PageGeneratorManager.getProjectPage(driver);
    }

    public TimeSheetPageObject openTimeSheetPage() {
        waitForElementClickable(driver, HeaderPageUI.TIMESHEET_LINK);
        clickToElement(driver, HeaderPageUI.TIMESHEET_LINK);
        return PageGeneratorManager.getTimeSheetPage(driver);
    }

    public RatingPageObject openRatingPage() {
        waitForElementClickable(driver, HeaderPageUI.RATING_LINK);
        clickToElement(driver, HeaderPageUI.RATING_LINK);
        return PageGeneratorManager.getRatingPage(driver);
    }

    public void openHeaderLinkByPageName(String pageName) {
        waitForElementClickable(driver, HeaderPageUI.DYNAMIC_HEADER_LINK, pageName);
        clickToElement(driver, HeaderPageUI.DYNAMIC_HEADER_LINK, pageName);
    }
}
