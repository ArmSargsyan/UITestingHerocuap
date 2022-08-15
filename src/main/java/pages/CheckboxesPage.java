package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.UiHelper;

public class CheckboxesPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
    private WebElement boxFirst;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
    private WebElement boxSecond;

    public void clickFirstBox(){
        UiHelper.clickOnWebElement(boxFirst);
    }

    public void clickSecondBox(){
        UiHelper.clickOnWebElement(boxSecond);
    }
}
