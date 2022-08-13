package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABTestingPage extends BasePage{

    @FindBy(xpath = "//*[@id='content']/div/p")
    private WebElement descriptionText;

    public String getDescriptionText(){
        return descriptionText.getText();
    }
}
