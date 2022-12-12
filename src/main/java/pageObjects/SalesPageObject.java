package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.navigation.HeaderNavigationPageObject;

public class SalesPageObject extends HeaderNavigationPageObject {
    WebDriver driver;

    public SalesPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
