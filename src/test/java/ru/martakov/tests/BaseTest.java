package ru.martakov.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import ru.martakov.util.DriverManager;
import ru.martakov.util.TestProperties;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static Properties properties = TestProperties.getInstance().getProperties();

    @BeforeClass
    public static void setUp() {
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        DriverManager.getDriver().get(properties.getProperty("app.url"));
    }

    @AfterClass
    public static void taerDown() {
        DriverManager.quitDriver();
    }
}
