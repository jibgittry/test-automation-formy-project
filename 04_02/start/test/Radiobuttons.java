import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\\\trainings\\\\TestingUnit\\\\Become a Test Automation Engineer\\\\3-Selenium Essential Training\\\\Tools\\\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\Chrome.exe");

        WebDriver driver = new ChromeDriver(chromeOptions);

        /*
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        There will be 3 different strategies

        // First, using the id of the radioButton
        Thread.sleep(2000); //2sec; Add a sleep statement to slow down the script
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));

        //Second, only the value can be used for this radioButton
        Thread.sleep(2000); //2sec; Add a sleep statement to slow down the script
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));

        //Third, the only solution is to use the XPath of the radioButton
        Thread.sleep(2000); //2sec; Add a sleep statement to slow down the script
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));

        //This just goes to show that a radio button can be found in a variety of ways,
        // using a variety of locator strategies.
         */

        // Let's do an exercise for the 3 checkboxes
        driver.get("https://formy-project.herokuapp.com/checkbox");

        // checkbox 1 per id
        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();
        Thread.sleep(2000); //2sec; Add a sleep statement to slow down the script
        // checkbox 2 per value
        WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();
        Thread.sleep(2000); //2sec; Add a sleep statement to slow down the script
        // checkbox 3 per XPath
        WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        checkbox3.click();
        Thread.sleep(2000); //2sec; Add a sleep statement to slow down the script

        driver.quit();
    }
}
