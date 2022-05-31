import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class test6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Data\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.kolmarden.com/");
        driver.get("https://www.kolmarden.com/handla/entre");

       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class=ui-btn  ui-btn--medium ui-btn--primary waves-effect ui-btn--text-center]")));*/

        driver.findElement(By.cssSelector("div[class*=quantity-selector-module_button__1l056 undefined quantity-selector-styled-module_right-button__eQx8H]")).click();
        //driver.findElement(By.className("ui-btn  ui-btn--medium ui-btn--primary waves-effect ui-btn--text-center")).click();
        //driver.findElement(By.cssSelector("quantity-selector-module_button__1l056 undefined quantity-selector-styled-module_right-button__eQx8H")).click();
    }
}
