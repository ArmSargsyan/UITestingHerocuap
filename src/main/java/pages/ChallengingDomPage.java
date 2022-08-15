package pages;

import core.DriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.UiHelper;

import java.util.ArrayList;

public class ChallengingDomPage extends BasePage {

    @FindBy(xpath = "//div[2]/div/div/div/div/div[1]/a[1]")
    private WebElement redButton;

    @FindBy(xpath = "//div[2]/div/div/div/div/div[1]/a[2]")
    private WebElement blueButton;

    public void getAnswer() {
        String answer = "";
        ArrayList<WebElement> scripts = new ArrayList<>(DriverProvider.getDriver().findElements(By.tagName("script")));
        for (int i = 0; i < scripts.size(); i++) {
            String focusText = scripts.get(i).getAttribute("innerHTML");
            if (focusText.contains("canvas.strokeText")) {
                answer = focusText.substring(focusText.indexOf("Answer"), focusText.indexOf("',"));
                break;
            }
        }
        System.out.println(answer);
    }

    public void clickToRedButton() {
        UiHelper.clickOnWebElement(blueButton);
        getAnswer();
    }

    public void clickToBlueButton() {
        UiHelper.clickOnWebElement(blueButton);
        getAnswer();
    }
}
