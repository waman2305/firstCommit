package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.ExecutionException;

public class ElementInteractions {





    private static Actions actions = new Actions(MainWebDriver.getDriver());
    private static Select select;
    private static WebDriverWait wait;

    public static void selectOption(WebElement element, String text) {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void hoverMouseOver(WebElement element) {
        actions.moveToElement(element).build().perform();
    }


    public static void hoverMouseOverAndClick(WebElement element) {
        actions.moveToElement(element).click().build().perform();
    }

    public static void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        try {
            element.click();
        } catch (Exception e) {
            hoverMouseOverAndClick(element);
        }

    }

    public static void inputText(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }


}
