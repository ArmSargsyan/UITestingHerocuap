package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.UiHelper;

public class HomePage extends BasePage{

    @FindBy(xpath = "//*[@id='content']/ul/li[1]/a")
    private WebElement abTestingPageButton;

    @FindBy(xpath = "//*[@id='content']/ul/li[2]/a")
    private WebElement addRemoveElementsButton;

    @Override
    public String pageUrl() {
        return "https://the-internet.herokuapp.com/";
    }

    public void openABTesting(){
        UiHelper.clickOnWebElement(abTestingPageButton);
    }

    public void openAddRemoveElements(){
        UiHelper.clickOnWebElement(addRemoveElementsButton);
    }
}
