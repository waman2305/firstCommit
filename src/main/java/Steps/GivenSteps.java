package Steps;

import MpukPages.MyPictureUk;
import io.cucumber.java.en.Given;


public class GivenSteps {


    @Given("Hello how are you")
    public void Hello() {
        MyPictureUk.initPage();


    }


}
