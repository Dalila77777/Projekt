import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Data\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.calculator.com/");
        driver.get("https://www.calculator.com/standard-tape/");
        driver.findElement(By.xpath("//input[@value='3']")).click();
        driver.findElement(By.xpath("//input[@value='3']")).click();
    }
}
