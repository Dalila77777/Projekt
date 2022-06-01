import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SearchFilter {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Data\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://bostad.stockholm.se/");
        driver.manage().window().maximize();
        driver.get("https://bostad.stockholm.se/Lista/?s=58.95001&n=59.90547&w=16.77612&e=19.50623&sort=annonserad-fran-desc");
        driver.findElement(By.className("js-approve-all-cookies")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='vanlig']")));
        driver.findElement(By.cssSelector("label[for='vanlig']")).click();
        Select drproom = new Select(driver.findElement(By.id("min-antal-rum")));
        drproom.selectByVisibleText("Min 2 rum");
        Select drpsurface= new Select(driver.findElement(By.id("min-yta")));
        drpsurface.selectByVisibleText("Min 60 kvm");
        Select drprent =new Select(driver.findElement(By.id("max-hyra")));
        drprent.selectByVisibleText("Max 10 000 kr");
        /*WebElement area= driver.findElement(By.name("typeahead"));
        area.sendKeys("Stockholm");
        Select areas = new Select(driver.findElement(By.id("awesomplete_list_1_item_undefined")));
        areas.selectByVisibleText("Stockholm");*/
        driver.findElement(By.name("filter-button")).click();


    }
}
