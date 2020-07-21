package ru.martakov.tests;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.martakov.pages.BasePage;
import ru.martakov.util.DriverManager;


public class SberTest extends BaseTest{




    @Test
    public void testScenario() {
        BasePage basePage = new BasePage();

        basePage.doubleClickTextOfTagSpan("Страхование");



        basePage.visibilityTextOfTagA("Страхование путешественников");
        basePage.clickTextOfTagA("Страхование путешественников");


        basePage.visibilityTextOfTagH3("для получения визы");
        basePage.clickHrefOfTagA("/dl/travel_ins");

        basePage.visibilityTextOfTagA("Выбор полиса");
        basePage.clickTextOfTagP("Необходимый минимум для оплаты медицинской помощи за границей");

        basePage.clickableTextOfTagButton("Оформить");
        basePage.clickTextOfTagButton("Оформить");

        basePage.clickableIdOfTagInput("surname_vzr_ins_0");

        String stringSurname = "Иванов";
        String sendKeysSurname = "surname_vzr_ins_0";
        basePage.sendKeysIdOfTagInput(stringSurname, sendKeysSurname);


        String stringName = "Иван";
        String sendKeysName = "name_vzr_ins_0";
        basePage.sendKeysIdOfTagInput(stringName,sendKeysName);

        String stringDateBirth = "01.01.1993";
        String sendKeysDateBirth = "birthDate_vzr_ins_0";
        basePage.sendKeysDateIdOfTagInput(stringDateBirth, sendKeysDateBirth);

        String stringSurnameInsured = "Иванов";
        String sendKeysSurnameInsured = "person_lastName";
        basePage.sendKeysIdOfTagInput(stringSurnameInsured, sendKeysSurnameInsured);

        String stringNameInsured = "Иван";
        String senKeysNameInsured = "person_firstName";
        basePage.sendKeysIdOfTagInput(stringNameInsured, senKeysNameInsured);

        String stringMiddleNameInsured = "Иванович";
        String senKeysMiddleNameInsured = "person_middleName";
        basePage.sendKeysIdOfTagInput(stringMiddleNameInsured, senKeysMiddleNameInsured);


        String stringDateBirthInsured = "01.01.1993";
        String sendKeysDateBirthInsured = "person_birthDate";
        basePage.sendKeysDateIdOfTagInput(stringDateBirthInsured, sendKeysDateBirthInsured);

        basePage.clickTextOfTagLabel("Женский");



        String stringPassportSeries = "4444";
        String sendKeysPassportSeries = "passportSeries";
        basePage.sendKeysIdOfTagInput(stringPassportSeries, sendKeysPassportSeries);

        String stringPassportNumber = "666666";
        String sendKeysPassportNumber = "passportNumber";
        basePage.sendKeysIdOfTagInput(stringPassportNumber, sendKeysPassportNumber);

        String stringPassportDate = "01.01.2016";
        String sendKeysPassportDate = "documentDate";
        basePage.sendKeysDateIdOfTagInput(stringPassportDate, sendKeysPassportDate);

        String stringPassportIssue = "УФМС";
        String sendKeysPassportIssue = "documentIssue";
        basePage.sendKeysIdOfTagInput(stringPassportIssue,sendKeysPassportIssue);

        basePage.attributeValueOfTagInput(sendKeysSurname,stringSurname);
        basePage.attributeValueOfTagInput(sendKeysName, stringName);
        basePage.attributeValueOfTagInput(sendKeysDateBirth, stringDateBirth);
        basePage.attributeValueOfTagInput(sendKeysSurnameInsured, stringSurnameInsured);
        basePage.attributeValueOfTagInput(senKeysNameInsured, stringNameInsured);
        basePage.attributeValueOfTagInput(senKeysMiddleNameInsured, stringMiddleNameInsured);
        basePage.attributeValueOfTagInput(sendKeysDateBirthInsured, stringDateBirthInsured);
        basePage.attributeButtonOfClass("Женский", "btn ng-valid active ng-touched ng-dirty");
        basePage.attributeValueOfTagInput(sendKeysPassportSeries, stringPassportSeries);
        basePage.attributeValueOfTagInput(sendKeysPassportNumber, stringPassportNumber);
        basePage.attributeValueOfTagInput(sendKeysPassportDate, stringPassportDate);
        basePage.attributeValueOfTagInput(sendKeysPassportIssue, stringPassportIssue);


        basePage.clickTextOfTagButton("Продолжить");
        basePage.visibilityTextOfTagDiv("При заполнении данных произошла ошибка");


    }




}
