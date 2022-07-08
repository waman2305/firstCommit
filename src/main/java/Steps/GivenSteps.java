package Steps;

import MpukPages.MyPictureUk;
import io.cucumber.java.en.Given;


public class GivenSteps {


    @Given("user enters the store")
    public void Hello() {
        MyPictureUk.initPage();


    }


}
