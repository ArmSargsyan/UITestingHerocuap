package pages;

import core.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    private final WebDriver driver = DriverProvider.getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public String pageUrl() {
        return "";
    }

    public void get() {
        driver.get(pageUrl());
    }
}
