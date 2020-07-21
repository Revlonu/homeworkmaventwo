package ru.martakov.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.martakov.util.DriverManager;

public class BasePage {

    private WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),10);

    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public void visibilityTextOfTagA(String string) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), '" + string + "')]")));
    }

    public void visibilityTextOfTagH3(String string) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(), '" + string + "')]")));
    }

    public void visibilityTextOfTagDiv(String string) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(), '" + string + "')]")));
    }

    public void clickableTextOfTagButton(String string) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), '" + string + "')]")));
    }

    public void clickableIdOfTagInput(String string) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='" + string + "']")));
    }

    public void doubleClickTextOfTagSpan(String string) {
        WebElement webElement = DriverManager.getDriver().findElement(By.xpath("//span[contains(text(), '" + string + "')]"));
        webElement.click();
        webElement.click();
    }

    public void clickTextOfTagA(String string) {
        WebElement webElement = DriverManager.getDriver().findElement(By.xpath("//a[contains(text(), '" + string + "')]"));
        webElement.click();
    }

    public void clickHrefOfTagA(String string) {
        WebElement webElement = DriverManager.getDriver().findElement(By.xpath("//a[@href='" + string + "']"));
        webElement.click();
    }

    public void clickTextOfTagLabel(String string) {
        WebElement webElement = DriverManager.getDriver().findElement(By.xpath("//label[contains(text(), '" + string + "')]"));
        webElement.click();
    }

    public void clickTextOfTagP(String string) {
        WebElement webElement = DriverManager.getDriver().findElement(By.xpath("//p[contains(text(), '" + string + "')]"));
        webElement.click();
    }

    public void clickTextOfTagButton(String string) {
        WebElement webElement = DriverManager.getDriver().findElement(By.xpath("//button[contains(text(), '" + string + "')]"));
        webElement.click();
    }

    public void sendKeysIdOfTagInput(String string, String stringSendKeys) {
        WebElement webElement = DriverManager.getDriver().findElement(By.xpath("//input[@id='" + stringSendKeys + "']"));
        webElement.sendKeys(string);
    }
    public void sendKeysDateIdOfTagInput(String string, String stringSendKeys) {
        WebElement webElement = DriverManager.getDriver().findElement(By.xpath("//input[@id='" + stringSendKeys + "']"));
        webElement.sendKeys(string);
        WebElement supportWebElement = DriverManager.getDriver().findElement(By.xpath("//input"));
        supportWebElement.click();
    }

    public void attributeValueOfTagInput(String attributeId, String value) {
        wait.until(ExpectedConditions.attributeContains(By.xpath("//input[@id='" + attributeId + "']"), "value", value));
    }

    public void attributeButtonOfClass(String string, String stringClass) {
        wait.until(ExpectedConditions.attributeContains(By.xpath("//label[contains(text(), '" + string + "')]"), "class", stringClass));
    }
}
