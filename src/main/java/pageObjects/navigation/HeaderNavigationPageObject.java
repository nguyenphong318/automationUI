package pageObjects.navigation;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.GlobalPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.SettingPageObject;
import pageUIs.HeaderPageUI;

public class HeaderNavigationPageObject extends BasePage {
    WebDriver driver;

    public HeaderNavigationPageObject(WebDriver driver) {
            this.driver = driver;
    }
    public SettingPageObject openSettingPage(WebDriver driver) {
        waitForElementClickable(driver, HeaderPageUI.SETTING_LINK);
        clickToElement(driver, HeaderPageUI.SETTING_LINK);
        return PageGeneratorManager.getSettingPage(driver);
    }

    public GlobalPageObject openGlobalPage(WebDriver driver) {
       waitForElementClickable(driver, HeaderPageUI.GLOBAL_LINK);
       clickToElement(driver,HeaderPageUI.GLOBAL_LINK);
       return PageGeneratorManager.getGlobalPage(driver);
    }
}
