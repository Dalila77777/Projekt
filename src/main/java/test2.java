import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class test2 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Data\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.calculator.com/");
        driver.get("https://www.calculator.com/standard-tape/");

        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();
        driver.findElement(By.xpath("//input[@value='3']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();
        driver.findElement(By.xpath("//input[@value='4']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();
        driver.findElement(By.xpath("//input[@value='5']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();
        driver.findElement(By.xpath("//input[@value='6']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();
        driver.findElement(By.xpath("//input[@value='7']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();
        driver.findElement(By.xpath("//input[@value='8']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();










        driver.findElement(By.xpath("//input[@value='=']")).click();
        //driver.findElement(By.xpath("//input[@value='AC']")).click();
        //driver.quit();




        //driver.findElement(By.className("button red btnsml caps")).click();

    }
}
