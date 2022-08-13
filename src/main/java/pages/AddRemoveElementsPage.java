package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.UiHelper;

public class AddRemoveElementsPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"content\"]/div/button")
    private WebElement addElementButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/button")
    private WebElement deleteButton;

    public void clickAddElement(){
        UiHelper.clickOnWebElement(addElementButton);
    }

    public void clickDeleteButton(){
        UiHelper.clickOnWebElement(deleteButton);
    }
}
