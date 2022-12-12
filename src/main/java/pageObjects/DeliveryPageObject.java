package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class DeliveryPageObject extends BasePage {
    WebDriver driver;

    public DeliveryPageObject(WebDriver driver) {
        this.driver = driver;
    }
}
