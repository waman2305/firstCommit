package MpukPages;

import org.openqa.selenium.support.PageFactory;
import util.MainWebDriver;

public class MyPictureUk {


    private final static String URL = "https://www.my-picture.co.uk";

    public static void initPage() {
        PageFactory.initElements(MainWebDriver.getDriver(), MyPictureUk.class);
        MainWebDriver.getDriver().get(URL);
    }


}
