package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.navigation.HeaderNavigationPageObject;

public class DeliveryPageObject extends HeaderNavigationPageObject {
    WebDriver driver;

    public DeliveryPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
