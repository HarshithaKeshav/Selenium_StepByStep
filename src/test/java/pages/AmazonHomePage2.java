package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage2 {

    WebDriver driver;

    By txt_searchbox = By.id("twotabsearchtextbox");
    By btn_searchbtn = By.id("nav-search-submit-button");

    public AmazonHomePage2(WebDriver driver){
        this.driver=driver;
    }

    public void enterSearchBox(String text){
        driver.findElement(txt_searchbox).sendKeys(text);
    }

    public void clickOnSearchButton(){
        driver.findElement(btn_searchbtn).click();
    }
}
