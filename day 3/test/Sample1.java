package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

public class Sample1 {
    WebDriver chromeDriver;
    //WebDriver safariDriver;

    @BeforeClass
    public void Opensample() {
        System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
    }

    @Test
    public void sample1() {
        String baseUrl = "http://demo.guru99.com/test/newtours/";

        chromeDriver.get(baseUrl);
        System.out.println("Chrome title = " + chromeDriver.getTitle());

    }

    @AfterClass
    public void closeBrowser() {
        chromeDriver.quit();
    }
}