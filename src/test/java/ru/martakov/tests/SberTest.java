package ru.martakov.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SberTest {

    private WebDriver driver;
    private WebDriverWait wait;

    private final static String BASE_URL = "http://www.sberbank.ru/ru/person";

    @Before
    public void StartUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,10);
        //Перейти по ссылка http://www.sberbank.ru/ru/person
        driver.get(BASE_URL);
    }

    @Test
    public void testScenario() {

        WebElement insurance = driver.findElement(By.xpath("//span[contains(text(), 'Страхование')]"));
        insurance.click();
        insurance.click();

        String stringTravelInsurance = "//a[contains(text(), 'Страхование путешественников')]";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(stringTravelInsurance)));

        WebElement travelInsurance = driver.findElement(By.xpath(stringTravelInsurance));
        travelInsurance.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(), 'для получения визы')]")));
        WebElement issueOnline = driver.findElement(By.xpath("//a[@href='/dl/travel_ins']"));
        issueOnline.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Выбор полиса')]")));
        WebElement minimumAmount = driver.findElement(By.xpath("//p[contains(text(), 'Необходимый минимум для оплаты медицинской помощи за границей')]"));
        minimumAmount.click();


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Оформить')]")));
        WebElement arrange = driver.findElement(By.xpath("//button[contains(text(), 'Оформить')]"));
        arrange.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='surname_vzr_ins_0']")));

        String stringSurname = "Иванов";
        WebElement surname = driver.findElement(By.xpath("//input[@id='surname_vzr_ins_0']"));
        surname.sendKeys(stringSurname);

        String stringName = "Иван";
        WebElement name = driver.findElement(By.xpath("//input[@id='name_vzr_ins_0']"));
        name.sendKeys(stringName);

        String stringDateBirth = "01.01.1993";
        WebElement dateBirth = driver.findElement(By.xpath("//input[@id='birthDate_vzr_ins_0']"));
        dateBirth.sendKeys(stringDateBirth);
        name.click();

        String stringSurnameInsured = "Иванов";
        WebElement surnameInsured = driver.findElement(By.xpath("//input[@id='person_lastName']"));
        surnameInsured.sendKeys(stringSurnameInsured);

        String stringNameInsured = "Иван";
        WebElement nameInsured = driver.findElement(By.xpath("//input[@id='person_firstName']"));
        nameInsured.sendKeys(stringNameInsured);

        String stringMiddleNameInsured = "Иванович";
        WebElement middleNameInsured = driver.findElement(By.xpath("//input[@id='person_middleName']"));
        middleNameInsured.sendKeys(stringMiddleNameInsured);

        String stringDateBirthInsured = "01.01.1993";
        WebElement dateBirthInsured = driver.findElement(By.xpath("//input[@id='person_birthDate']"));
        dateBirthInsured.sendKeys(stringDateBirthInsured);
        middleNameInsured.click();

        WebElement female = driver.findElement(By.xpath("//label[contains(text(), 'Женский')]"));
        female.click();

        String stringPassportSeries = "4444";
        WebElement passportSeries = driver.findElement(By.xpath("//input[@id='passportSeries']"));
        passportSeries.sendKeys(stringPassportSeries);

        String stringPassportNumber = "666666";
        WebElement passportNumber = driver.findElement(By.xpath("//input[@id='passportNumber']"));
        passportNumber.sendKeys(stringPassportNumber);

        String stringPassportDate = "01.01.2016";
        WebElement passportDate = driver.findElement(By.xpath("//input[@id='documentDate']"));
        passportDate.sendKeys(stringPassportDate);
        passportNumber.click();

        String stringPassportIssue = "УФМС";
        WebElement passportIssue = driver.findElement(By.xpath("//input[@id='documentIssue']"));
        passportIssue.sendKeys(stringPassportIssue);

        wait.until(ExpectedConditions.attributeContains(surname, "value", stringSurname));
        wait.until(ExpectedConditions.attributeContains(name, "value", stringName));
        wait.until(ExpectedConditions.attributeContains(dateBirth, "value", stringDateBirth));
        wait.until(ExpectedConditions.attributeContains(surnameInsured, "value", stringSurnameInsured));
        wait.until(ExpectedConditions.attributeContains(nameInsured, "value", stringNameInsured));
        wait.until(ExpectedConditions.attributeContains(middleNameInsured, "value", stringMiddleNameInsured));
        wait.until(ExpectedConditions.attributeContains(dateBirthInsured, "value", stringDateBirthInsured));
        wait.until(ExpectedConditions.attributeContains(female, "class", "btn ng-valid active ng-touched ng-dirty"));
        wait.until(ExpectedConditions.attributeContains(passportSeries, "value", stringPassportSeries));
        wait.until(ExpectedConditions.attributeContains(passportNumber, "value", stringPassportNumber));
        wait.until(ExpectedConditions.attributeContains(passportDate, "value", stringPassportDate));
        wait.until(ExpectedConditions.attributeContains(passportIssue, "value", stringPassportIssue));


        WebElement proceed = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
        proceed.click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(), 'При заполнении данных произошла ошибка')]")));


    }

    @After
    public void tearDown(){
        //driver.quit();
        //driver = null;
    }


}
