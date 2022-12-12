package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class SettingPageObject extends BasePage {
    WebDriver driver;
    public SettingPageObject(WebDriver driver) {
        this.driver = driver;
    }
}
