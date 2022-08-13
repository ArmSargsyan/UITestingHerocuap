package utils;

import core.DriverProvider;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

@UtilityClass
public class WaitHelper {

    private final WebDriver driver = DriverProvider.getDriver();

    private final Wait<WebDriver> wait = new WebDriverWait(driver, 15);

    public static void waitElementToBeClickable(final WebElement target) {
        wait.until(ExpectedConditions.elementToBeClickable(target));
    }

    public static void waitElementToBeVisible(final WebElement target) {
        wait.until(ExpectedConditions.visibilityOf(target));
    }

    public static void waitElementToBeSelected(final WebElement target){
        wait.until(ExpectedConditions.elementToBeSelected(target));
    }
}
