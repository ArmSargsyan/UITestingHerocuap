import core.BaseTest;
import lombok.SneakyThrows;
import org.testng.annotations.*;
import pages.*;

import static org.testng.Assert.assertEquals;

@Test
public class Tests extends BaseTest {

    private HomePage homePage;
    private ABTestingPage abTestingPage;
    private AddRemoveElementsPage addRemoveElementsPage;
    private ChallengingDomPage challengingDomPage;
    private CheckboxesPage checkboxesPage;

    @BeforeMethod
    public void initPages() {
        homePage = new HomePage();
        abTestingPage = new ABTestingPage();
        addRemoveElementsPage = new AddRemoveElementsPage();
        challengingDomPage = new ChallengingDomPage();
        checkboxesPage = new CheckboxesPage();
        homePage.get();
    }

    @AfterMethod
    public void closeChrome(){
        tearDown();
    }

    @Test(priority = 1)
    public void abTestingPageTest() {
        homePage.openABTesting();
        assertEquals(abTestingPage.getDescriptionText(),
                "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).");
        System.out.println(abTestingPage.getDescriptionText());
    }

    @Test(priority = 2)
    @SneakyThrows
    public void addRemoveElementsTest() {
        homePage.openAddRemoveElements();
        addRemoveElementsPage.clickAddElement();
        Thread.sleep(4000);
        addRemoveElementsPage.clickDeleteButton();
    }

    @Test(priority = 3)
    @SneakyThrows
    public void challengingDomTest() {
        homePage.openChallengingDom();
        challengingDomPage.getAnswer();
        Thread.sleep(3000);
        challengingDomPage.clickToBlueButton();
        Thread.sleep(3000);
        challengingDomPage.clickToRedButton();
    }

    @Test(priority = 4)
    public void checkBoxTest(){
        homePage.openCheckBoxes();
        checkboxesPage.clickFirstBox();
        checkboxesPage.clickSecondBox();
    }
}
