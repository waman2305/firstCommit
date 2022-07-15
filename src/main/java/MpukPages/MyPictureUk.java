package MpukPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.MainWebDriver;

public class MyPictureUk {


    @FindBy (xpath = "//li//a[text() = 'Wall Decoration']")
    private static WebElement hoverToWallDecor;

    @FindBy (xpath = "//div//nav//ul//li//a[@href = '/photo-prints/canvas-prints.jsf']")
    private static WebElement hoverAndClickToCanvasProduct;

    @FindBy (xpath = "//div[@class = 'upload-button -fullbleed']//input[@id = 'uploadInputId533']")
    private static WebElement uploadPhoto;

    @FindBy (xpath = "//td//label [text()= '20x20 cm']")
    private static WebElement selectSize20x20;

    @FindBy (xpath = "//a[@id = 'UploadFileDesktop']")
    private static WebElement clickToTheButtonContinueToShoppingCart;

    @FindBy (xpath = "//button[@id = 'shoppingcartForm:proceedToCheckout']")
    private static WebElement clickFirstToButtonSecureCheckout;

    @FindBy (xpath = "//a[@href = '/orderaddresses.jsf']")
    private static WebElement clickSecondToButtonSecureCheckout;




    @FindBy (xpath = "//input[@id = 'addressesForm:invoiceEmail']")
    private static WebElement inputEmailAddress;

    @FindBy (xpath = "//input[@id = 'addressesForm:invoiceForename']")
    private static WebElement inputFirstMane;

    @FindBy (xpath = "//input[@id = 'addressesForm:invoiceSurname']")
    private static WebElement inputLastName;

    @FindBy (xpath = "//input[@id = 'addressesForm:invoiceStreet']")
    private static WebElement inputStreet;

    @FindBy (xpath = "//input[@id = 'addressesForm:invoiceCity']")
    private static WebElement inputCity;

    @FindBy (xpath = "//input[@id = 'addressesForm:invoiceZipCode']")
    private static WebElement inputPostCode;

    @FindBy (xpath = "//button[@id = 'addressesForm:j_id_cj']")
    private static WebElement continueAddressForm;

    @FindBy (xpath = "//input [@id = 'cardHolder']")
    private static WebElement inputNameOnCard;

    @FindBy (xpath = "//input[@id = 'cardNumber']")
    private static WebElement inputCardNumber;

    @FindBy (xpath = "//select[@id = 'cardExpirationMonth']")
    private static WebElement selectExpirationDateMonth;

    @FindBy (xpath = "//select[@id = 'cardExpirationYear']")
    private static WebElement selectExpirationDateYear;

    @FindBy (xpath = "//input[@id = 'cardSecurityCode']")
    private static WebElement inputCardVerificationNumber;

    @FindBy (xpath = "//div[@id = 'paymentMethod:proceed']//button[@type = 'button']")
    private static WebElement clickContinueFromPymentMethod;


    @FindBy (xpath = "//input [@id = 'orderConfirmationForm:acceptGTC']")
    private static WebElement clickToAgreeConditions;

    @FindBy (xpath = "//button[@id = 'orderConfirmationForm:buyNowButton']")
    private static WebElement ClickToTheButtonBuyNow;



    @FindBy (xpath = "//button//span[text() = 'NO']")
    private static WebElement clickNo;

    @FindBy (xpath = "/html/body/section/div[1]/div/p[1]/a")
    private static WebElement orderNumber;














    public static WebElement getHoverToWallDecor() {
        return hoverToWallDecor;
    }

    public static WebElement getHoverAndClickToCanvasProduct() {
        return hoverAndClickToCanvasProduct;
    }

    public static WebElement getUploadPhoto() {
        return uploadPhoto;
    }

    public static WebElement getSelectSize20x20() {
        return selectSize20x20;
    }

    public static WebElement getClickToTheButtonContinueToShoppingCart() {
        return clickToTheButtonContinueToShoppingCart;
    }

    public static WebElement getClickFirstToButtonSecureCheckout() {
        return clickFirstToButtonSecureCheckout;
    }

    public static WebElement getClickSecondToButtonSecureCheckout() {
        return clickSecondToButtonSecureCheckout;
    }

    public static WebElement getInputEmailAddress() {
        return inputEmailAddress;
    }

    public static WebElement getInputFirstMane() {
        return inputFirstMane;
    }

    public static WebElement getInputLastName() {
        return inputLastName;
    }

    public static WebElement getInputStreet() {
        return inputStreet;
    }

    public static WebElement getInputCity() {
        return inputCity;
    }

    public static WebElement getInputPostCode() {
        return inputPostCode;
    }

    public static WebElement getContinueAddressForm() {
        return continueAddressForm;
    }


    public static WebElement getInputNameOnCard() {
        return inputNameOnCard;
    }

    public static WebElement getInputCardNumber() {
        return inputCardNumber;
    }

    public static WebElement getSelectExpirationDateMonth() {
        return selectExpirationDateMonth;
    }

    public static WebElement getSelectExpirationDateYear() {
        return selectExpirationDateYear;
    }

    public static WebElement getInputCardVerificationNumber() {
        return inputCardVerificationNumber;
    }


    public static WebElement getClickContinueFromPymentMethod() {
        return clickContinueFromPymentMethod;
    }

    public static WebElement getClickToAgreeConditions() {
        return clickToAgreeConditions;
    }

    public static WebElement getClickToTheButtonBuyNow() {
        return ClickToTheButtonBuyNow;
    }

    public static WebElement getClickNo() {
        return clickNo;
    }

    public static WebElement getOrderNumber() {
        return orderNumber;
    }

    private final static String URL = "https://www.my-picture.co.uk";

    public static void initPage() {
        PageFactory.initElements(MainWebDriver.getDriver(), MyPictureUk.class);
        MainWebDriver.getDriver().get(URL);
    }




}
