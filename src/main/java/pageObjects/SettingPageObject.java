package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.navigation.HeaderNavigationPageObject;

public class SettingPageObject extends HeaderNavigationPageObject {
    WebDriver driver;
    public SettingPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
