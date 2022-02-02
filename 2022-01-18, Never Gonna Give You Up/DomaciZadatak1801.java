package Selenium.domaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DomaciZadatak1801 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.rs");
        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        Thread.sleep(3000);
        searchBox.sendKeys(Keys.ENTER);

        WebElement videoClick = driver.findElement(By.cssSelector(".lSegpf.tNxQIb.ynAwRc"));
        videoClick.click();
    }
}
