package Steps;

import MpukPages.MyPictureUk;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import util.ElementInteractions;


public class GivenSteps {


    @Given("user enters the store")
    public void userEntersTheStore() throws InterruptedException {
        MyPictureUk.initPage();
        Thread.sleep(2000);
        ElementInteractions.hoverMouseOver(MyPictureUk.getHoverToWallDecor());
        Thread.sleep(500);
        ElementInteractions.hoverMouseOverAndClick(MyPictureUk.getHoverAndClickToCanvasProduct());
        ElementInteractions.uploadingPhoto(MyPictureUk.getUploadPhoto());
    }

    @And ("adds a Canvas product to the cart.")
    public void selectCanvasProduct() throws InterruptedException {
        Thread.sleep(500);
        //ElementInteractions.clickElement(MyPictureUk.getSelectSize20x20());
        ElementInteractions.hoverMouseOverAndClick(MyPictureUk.getClickToTheButtonContinueToShoppingCart());
        ElementInteractions.hoverMouseOverAndClick(MyPictureUk.getClickFirstToButtonSecureCheckout());
        ElementInteractions.hoverMouseOverAndClick(MyPictureUk.getClickSecondToButtonSecureCheckout());

        Thread.sleep(3000);


        ElementInteractions.inputText(MyPictureUk.getInputEmailAddress(), "leonid.gnatcovshi@g.picanova.com");
        ElementInteractions.inputText(MyPictureUk.getInputFirstMane(), "TestTestTestTestTest");
        ElementInteractions.inputText(MyPictureUk.getInputLastName(), "TestTestTestTestTest");
        ElementInteractions.inputText(MyPictureUk.getInputStreet(), "#reject1");
        ElementInteractions.inputText(MyPictureUk.getInputCity(), "TEST");
        ElementInteractions.inputText(MyPictureUk.getInputPostCode(), "12345");
        Thread.sleep(1000);
        ElementInteractions.clickElement(MyPictureUk.getContinueAddressForm());




        ElementInteractions.inputText(MyPictureUk.getInputNameOnCard(), "Bijenkorf");
        ElementInteractions.inputText(MyPictureUk.getInputCardNumber(), "4111 1111 1111 1111");
        ElementInteractions.selectOption(MyPictureUk.getSelectExpirationDateMonth(), "03 - March");
        ElementInteractions.selectOption(MyPictureUk.getSelectExpirationDateYear(), "2030");
        ElementInteractions.inputText(MyPictureUk.getInputCardVerificationNumber(), "737");


        Thread.sleep(1500);

        ElementInteractions.clickElement(MyPictureUk.getClickContinueFromPymentMethod());



        ElementInteractions.clickElement(MyPictureUk.getClickToAgreeConditions());

        Thread.sleep(1500);
        ElementInteractions.clickElement(MyPictureUk.getClickToTheButtonBuyNow());


        Thread.sleep(1500);

/*        ElementInteractions.hoverMouseOverAndClick(MyPictureUk.getClickNo());*/
        ElementInteractions.sendOrderNumber(MyPictureUk.getOrderNumber());












    }




}



