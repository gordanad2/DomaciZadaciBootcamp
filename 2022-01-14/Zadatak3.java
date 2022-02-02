package Selenium.predavanja7nedelja.petak;
//Zadatak 3 - Ulogovati se na sajt https://demoqa.com/ preko kolacica,
// izlogovati se i asertovati da je korisnik izlogovan


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/login");

    /*    WebElement username = driver.findElement(By.id("userName"));
   //     wdwait.until(ExpectedConditions.elementToBeClickable(By.id("UserName")));
        username.sendKeys("gordanad2");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Qwerty123!");
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("password")));

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();

        WebElement logoutButton = driver.findElement(By.id("submit"));
        logoutButton.click();*/
        Cookie username = new Cookie("username","gordanad2");
        driver.manage().addCookie(username);

        Cookie userId = new Cookie("userID", "b452b242-8b15-4709-a345-4849eaa11d96");
        driver.manage().addCookie(userId);

        Cookie token = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6ImdvcmRhbmFkMiIsInBhc3N3b3JkIjoiUXdlcnR5MTIzISIsImlhdCI6MTY0MjM0NzY2N30.HnEZwnB9qMcWxaaPVpTq2yJSjNNhKYK3WFwZV7Hqe_Q");
        driver.manage().addCookie(token);

        Cookie expires = new Cookie("expires", "2022-01-23T15%3A47%3A55.483Z");
        driver.manage().addCookie(expires);

        driver.navigate().refresh();

        WebElement logoutButton = driver.findElement(By.id("submit"));
        logoutButton.click();

       /* Thread.sleep(2000);
        driver.navigate().to("https://demoqa.com/profile");*/
        String expectedURL = "https://demoqa.com/login";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);



    }
}
