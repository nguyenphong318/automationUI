package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class TimeSheetPageObject extends BasePage {
    WebDriver driver;

    public TimeSheetPageObject(WebDriver driver) {
        this.driver = driver;
    }
}
