package tests.base;

import driver.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setUp(){
        DriverManager.currentDriver().get("https://www.indiegogo.com/");
    }

    @AfterClass
    public void close(){
        DriverManager.currentDriver().quit();
    }

}
