package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.navigation.HeaderNavigationPageObject;

public class ProjectPageObject extends HeaderNavigationPageObject {
    WebDriver driver;

    public ProjectPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
