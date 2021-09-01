package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {

    public WebElement txt_searchbox(WebDriver driver){
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        return element;

    }
    public WebElement btn_searchbtn(WebDriver driver) {
        WebElement element = driver.findElement(By.id("nav-search-submit-button"));
        return element;
    }
}
