import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Data\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://outlook.live.com/owa/");
        System.out.println(driver.getTitle());
        driver.get("https://outlook.live.com/owa/?nlp=1");
        //driver.findElement(By.xpath("//a[@href='https://outlook.live.com/owa/?nlp=1+']")).click();
        WebElement txt_username = driver.findElement(By.name("loginfmt"));
        txt_username.sendKeys("testtesttest7777775@outlook.com");
        //driver.findElement(By.name("submit")).click();
        driver.findElement(By.id("idSIButton9")).click();
        //driver.findElement(By.xpath(".//*[@id='idSIButton9']/div[24]a")).click();
        //driver.findElement(By.xpath("//input[@value='Next' and @type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=password]")));
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Testtesttest7-");
        //System.out.println(password.getText());
        //driver.findElement(By.id("i0118")).sendKeys("Testtesttest7-");
        //WebElement password= driver.findElement(By.xpath("..//*[@id='i0118']/div[25]a"));
        //WebElement password= driver.findElement(By.name("passwd"));
       // password.sendKeys("Testtesttest7-");
        driver.findElement(By.id("idSIButton9")).click();
       //diver.findElement(By.xpath(".//*[@id='idSIButton9']/div[29]a")).click();
        // driver.findElement(By.xpath(".//*[@id='idBtn_Back']/div[26]a")).click();
        driver.findElement(By.id("idBtn_Back")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.elementToBeClickable(By.id("O365_MainLink_Me")));


        //driver.get("https://storage.live.com/mydata/myprofile/expressionprofile/profilephoto:UserTileStatic,UserTileSmaller/MeControlMediumUserTile?ck=1&ex=24&fofoff=1&sc=1654028778252");
        //driver.get("https://outlook.live.com/mail/logoff.owa");
        driver.findElement(By.id("O365_MainLink_Me")).click();
        driver.findElement(By.id("mectrl_body_signOut")).click();

        //driver.quit();
    }
}
