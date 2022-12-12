package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.navigation.HeaderNavigationPageObject;
import pageUIs.OverviewPageUI;

public class GlobalPageObject extends HeaderNavigationPageObject {
    WebDriver driver;
    public GlobalPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
