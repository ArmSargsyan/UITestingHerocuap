import core.BaseTest;
import lombok.SneakyThrows;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ABTestingPage;
import pages.AddRemoveElementsPage;
import pages.HomePage;
import utils.WaitHelper;

import static org.testng.Assert.*;

@Test
public class Tests extends BaseTest {

    private HomePage homePage;
    private ABTestingPage abTestingPage;
    private AddRemoveElementsPage addRemoveElementsPage;

    @BeforeTest
    public void initPages() {
        homePage = new HomePage();
        abTestingPage = new ABTestingPage();
        addRemoveElementsPage = new AddRemoveElementsPage();
        homePage.get();
    }

    public void abTestingPageTest(){
     homePage.openABTesting();
     assertEquals(abTestingPage.getDescriptionText(),
             "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).");
        System.out.println(abTestingPage.getDescriptionText());
    }

    @SneakyThrows
    public void addRemoveElementsTest(){
        homePage.openAddRemoveElements();
        addRemoveElementsPage.clickAddElement();
        Thread.sleep(4000);
        addRemoveElementsPage.clickDeleteButton();

    }
}
