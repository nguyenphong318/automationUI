package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.OverviewPageUI;

public class OverviewPageObject extends BasePage {
    WebDriver driver;
    public OverviewPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isOverViewDisplayed(String overView) {
        waitForElementVisible(driver, OverviewPageUI.OVERVIEW_TEXT);
        String overViewText = getElementText(driver, OverviewPageUI.OVERVIEW_TEXT);
        return overViewText.contains(overView);
    }
}
