
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import java.time.Duration;
        import java.util.concurrent.TimeUnit;

public class GoogleSearch {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Data\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.id("L2AGLb")).click();
        WebElement p=driver.findElement(By.name("q"));
        p.sendKeys("Selenium Java");
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
        p.submit();
        driver.close();

    }
}
