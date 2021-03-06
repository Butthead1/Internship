import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOpen {

    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void testOpen() {
        driver = ChromeDriverFactory.initCD();
        wait = new WebDriverWait(driver,30,0);
        driver.get("https://movavi.id/login");
        driver.findElement(By.xpath("//*[@id=\"emailLogin\"]")).sendKeys("maadslayer@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"passwordLogin\"]")).sendKeys("Morozov617539s");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.id("loaderWrapper"))));
        driver.findElement(By.cssSelector(".d-md-inline")).click();
        driver.findElement(By.linkText("Мои данные")).click();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}