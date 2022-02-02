package domaci8nedelja.POMBazna;

import domaci8nedelja.POMStranice.Cart;
import domaci8nedelja.POMStranice.Category;
import domaci8nedelja.POMStranice.SidebarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePageH {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public Category categoryPage;
    public Cart cartPage;
    public SidebarPage sidebarPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        categoryPage = new Category(driver, wdwait);
        cartPage = new Cart(driver, wdwait);
        sidebarPage = new SidebarPage(driver,wdwait);

    }

      @AfterClass
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
