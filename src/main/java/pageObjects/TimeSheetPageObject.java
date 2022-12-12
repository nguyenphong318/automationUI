package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.navigation.HeaderNavigationPageObject;

public class TimeSheetPageObject extends HeaderNavigationPageObject {
    WebDriver driver;

    public TimeSheetPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
