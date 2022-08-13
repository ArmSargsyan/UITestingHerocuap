package core;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setup() {
        DriverProvider.getDriver();
    }

//    @AfterSuite
//    public void tearDown() {
//        DriverProvider.quitDriver();
//    }
}
