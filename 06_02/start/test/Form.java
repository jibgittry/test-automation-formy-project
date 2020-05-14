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
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\\\trainings\\\\TestingUnit\\\\Become a Test Automation Engineer\\\\3-Selenium Essential Training\\\\Tools\\\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\Chrome.exe");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://formy-project.herokuapp.com/form");

        // using th ID placeholder, but I will not define any web elements before driving action on them,
        // just go and do it all on one line.
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("job-title")).sendKeys("Developer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-3")).click();
        // This will be a bit different in using a CSS Selector with the tag name as 'option'
        // If we want to choose the first 1, and then find the value of "1"
        driver.findElement(By.cssSelector("option[value='1']")).click();
        // Remember for datepicker, we are going to open it and then close it
        driver.findElement(By.id("datepicker")).sendKeys("05/05/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        // Here to be able to submit the form, the use of CSS Selector for the classes
        // the dot '.' in the front of the classes and '.' in between classes
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        // define the object
        WebDriverWait wait = new WebDriverWait(driver, 90);
        // define the element
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

        // Use of assertion to check the conformation before sending the alert banner
        String alertText = alert.getText();
        assertEquals("The form was successfully submitted!", alertText);

        // Just to have time to see the filled form
        //Thread.sleep(7000); //2sec; Add a sleep statement to slow down the script

        driver.quit();
    }
}
