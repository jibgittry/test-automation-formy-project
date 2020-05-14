import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\\\trainings\\\\TestingUnit\\\\Become a Test Automation Engineer\\\\3-Selenium Essential Training\\\\Tools\\\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\Chrome.exe");
        // a new instance of the Chrome driver is created
        WebDriver driver = new ChromeDriver(chromeOptions);
        // the driver navigates to the form page
        driver.get("https://formy-project.herokuapp.com/form");

        // the form is submitted
        submitForm(driver);

        // Just to have time to see the filled form
        Thread.sleep(7000); //2sec; Add a sleep statement to slow down the script

        // then we wait for the alert banner to appear
        waitForAlertBanner(driver);
        // there is the assertion that compares the expected banner alert to the actual banner alert test
        assertEquals("The form was successfully submitted!", getAlertBannerText(driver));
        // finally the test quits
        driver.quit();
    }

    public static void submitForm(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("first-name")).sendKeys("John");

        driver.findElement(By.id("last-name")).sendKeys("Doe");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

    public static void waitForAlertBanner(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
    }

    public  static String getAlertBannerText(WebDriver driver)
    {
        return driver.findElement(By.className("alert")).getText();
    }
}
