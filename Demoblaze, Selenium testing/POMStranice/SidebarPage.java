package domaci8nedelja.POMStranice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidebarPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement home;
    public WebElement contact;
    public WebElement aboutUs;
    public WebElement cart;
    public WebElement logIn;
    public WebElement signUp;

    public SidebarPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHome() {
        return driver.findElement(By.linkText("Home"));
    }

    public WebElement getContact() {
        return driver.findElement(By.linkText("Contact"));
    }

    public WebElement getAboutUs() {
        return driver.findElement(By.linkText("About us"));
    }

    public WebElement getCart() {
        return driver.findElement(By.id("cartur"));
    }

    public WebElement getLogIn() {
        return driver.findElement(By.id("login2"));
    }

    public WebElement getSignUp() {
        return driver.findElement(By.id("signin2"));
    }

    //--------------------------------------------------

    public void clickOnCart(){
        getCart().click();
    }
}
