package domaci8nedelja.POMStranice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement cartPage;
    WebElement placeOrderButton;
    List<WebElement> cartItems;

    public Cart(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCartPage() {
        return driver.findElement(By.linkText("Products"));
    }

    public WebElement getPlaceOrderButton() {
        return driver.findElement(By.cssSelector(".btn.btn-success"));
    }

    public List<WebElement> getCartItems() {
        return driver.findElements(By.className("success"));
    }

    //-------------------------------------
    // vraca boolean vrednost koja je true ako se elementi nalaze u korpi
    public boolean cartItems(String[] el){

        int brojac = 0;
        for(String e: el){
        for (int i = 0; i < getCartItems().size(); i++) {
            String z = getCartItems().get(i).getText();
            if (z.contains(e)) {
                Assert.assertTrue(z.contains(e));
                brojac = brojac + 1;
            }
        }
    }
        return brojac == el.length;
    }
}
