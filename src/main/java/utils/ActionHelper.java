package utils;

import core.DriverProvider;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@UtilityClass
public class ActionHelper {

    private final WebDriver driver = DriverProvider.getDriver();
    private final Actions actions = new Actions(driver);

    public void dragAndDrop(final WebElement source, final WebElement target){
        actions
                .dragAndDrop(source, target)
                .build()
                .perform();
    }

    public void rightClick(final WebElement target){
        actions
                .contextClick()
                .build()
                .perform();
    }

    public void movMouseToElement(final  WebElement target){
        actions
                .moveToElement(target)
                .build()
                .perform();
    }
}
