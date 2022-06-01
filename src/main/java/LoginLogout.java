import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginLogout {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Data\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://outlook.live.com/owa/");
        System.out.println(driver.getTitle());
        driver.get("https://outlook.live.com/owa/?nlp=1");
        WebElement txt_username = driver.findElement(By.name("loginfmt"));
        txt_username.sendKeys("testtesttest7777775@outlook.com");
        driver.findElement(By.id("idSIButton9")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=password]")));
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Testtesttest7-");
        driver.findElement(By.id("idSIButton9")).click();
        driver.findElement(By.id("idBtn_Back")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("O365_MainLink_Me")));
        driver.findElement(By.id("O365_MainLink_Me")).click();
        driver.findElement(By.id("mectrl_body_signOut")).click();
    }
}
