import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\trainings\\TestingUnit\\Become a Test Automation Engineer\\3-Selenium Essential Training\\Tools\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\Chrome.exe");

        WebDriver driver = new ChromeDriver(chromeOptions);

        //WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys( "John Doe");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
