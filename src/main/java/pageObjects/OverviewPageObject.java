package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.navigation.HeaderNavigationPageObject;
import pageUIs.OverviewPageUI;

public class OverviewPageObject extends HeaderNavigationPageObject {
    WebDriver driver;
    public OverviewPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isOverViewDisplayed(String overView) {
        waitForElementVisible(driver, OverviewPageUI.OVERVIEW_TEXT);
        String overViewText = getElementText(driver, OverviewPageUI.OVERVIEW_TEXT);
        return overViewText.contains(overView);
    }
}
