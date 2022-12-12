package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class SalesPageObject extends BasePage {
    WebDriver driver;

    public SalesPageObject(WebDriver driver) {
        this.driver = driver;
    }
}
