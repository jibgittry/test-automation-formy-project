import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
        // a new instance of the Chrome driver is created
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://formy-project.herokuapp.com/form");

        // create a new form page object called formPage
        FormPage formPage = new FormPage();
        // before calling the submit form method, we use the object in order to call the method directly from the FormPage test class
        formPage.submitForm(driver);

        // create a new object of the ConfirmationPage
        ConfirmationPage confirmationPage = new ConfirmationPage();
        // use that object to call the method on that page
        confirmationPage.waitForAlertBanner(driver);

        // use also that object along with getAlertBannerText
        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }


}
