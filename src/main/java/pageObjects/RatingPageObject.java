package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.navigation.HeaderNavigationPageObject;

public class RatingPageObject extends HeaderNavigationPageObject {
    WebDriver driver;

    public RatingPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
