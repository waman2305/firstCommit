package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.MainWebDriver;

public class BeforeAfterSteps {

    @Before
    public void beforeTest(){
        MainWebDriver.startDriver();
    }


    @After
    public void afterTest(){
        MainWebDriver.getDriver().quit();
    }


}
