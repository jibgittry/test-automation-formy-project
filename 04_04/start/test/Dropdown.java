import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\\\trainings\\\\TestingUnit\\\\Become a Test Automation Engineer\\\\3-Selenium Essential Training\\\\Tools\\\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\Chrome.exe");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://formy-project.herokuapp.com/dropdown");

        // Using the ID of the dropDownMenu
        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        // Selecting a component from the dropDownMenu list
        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        Thread.sleep(3000); //2sec; Add a sleep statement to slow down the script
        autocompleteItem.click();

        Thread.sleep(3000); //2sec; Add a sleep statement to slow down the script

        driver.quit();
    }
}
