import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testAddToCart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Data\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.skansen.se/sv/");
        driver.get("https://www.skansenbiljett.se/");
        driver.findElement(By.id("startpage_list_ctl01_hlImageLink")).click();
        //Personnummer x är Obligatoriskt (Du behöver ange den istället för x)
        driver.findElement(By.id("ctl00_main_ctl00_ctl00_NewCard_cardHolder_tbxCardHolderPid")).sendKeys("x");
        driver.findElement(By.name("ctl00$main$ctl00$ctl00$NewCard$cardHolder$tbxFirstName")).sendKeys("Förnamn");
        driver.findElement(By.name("ctl00$main$ctl00$ctl00$NewCard$cardHolder$tbxLastName")).sendKeys("Efternamn");
        driver.findElement(By.name("ctl00$main$ctl00$ctl00$NewCard$cardHolder$tbxCardHolderAddress")).sendKeys("Gatan 1");
        driver.findElement(By.name("ctl00$main$ctl00$ctl00$NewCard$cardHolder$tbxCardHolderZipCode")).sendKeys("567 65");
        driver.findElement(By.name("ctl00$main$ctl00$ctl00$NewCard$cardHolder$tbxCardHolderCity")).sendKeys("Stockholm");
        driver.findElement(By.name("ctl00$main$ctl00$ctl00$NewCard$cardHolder$tbxCardHolderMobilePhoneNumber")).sendKeys("0711111111");
        driver.findElement(By.name("ctl00$main$ctl00$ctl00$NewCard$cardHolder$tbxCardHolderEmailAddress")).sendKeys("test@outlook.com");
        driver.findElement(By.id("ctl00_main_ctl00_ctl00_NewCard_chkAcceptTerms")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_main_ctl00_ctl00_NewCard_AddToCart")));
        driver.findElement(By.id("ctl00_main_ctl00_ctl00_NewCard_AddToCart")).click();

    }
}
