package utils;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebElement;

@UtilityClass
public class UiHelper {

    public void clickOnWebElement(final WebElement target){
        WaitHelper.waitElementToBeClickable(target);
        target.click();
    }
}
