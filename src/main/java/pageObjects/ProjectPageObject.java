package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class ProjectPageObject extends BasePage {
    WebDriver driver;

    public ProjectPageObject(WebDriver driver) {
        this.driver = driver;
    }
}
