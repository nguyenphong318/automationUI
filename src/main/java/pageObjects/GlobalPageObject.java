package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class GlobalPageObject extends BasePage {
    WebDriver driver;
    public GlobalPageObject(WebDriver driver) {
        this.driver = driver;
    }
}
