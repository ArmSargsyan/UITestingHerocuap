package core;

import org.testng.annotations.*;

public class BaseTest {

    @BeforeSuite
    public void setup() {
        DriverProvider.getDriver();
    }


//    @AfterSuite
    public void tearDown() {
        DriverProvider.quitDriver();
    }
}
