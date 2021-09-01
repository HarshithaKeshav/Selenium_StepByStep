package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.AmazonHomePage;
import pages.AmazonHomePage2;

public class FirstTestCase {
        WebDriver driver;
        AmazonHomePage2 amazonHomePage2;

        @BeforeSuite
        public void setUp(){
            String ProjDir = System.getProperty("user.dir");
            System.out.println(ProjDir);
            System.setProperty("webdriver.chrome.driver", ProjDir+"/src/test/resources/drivers/chromedriver");
            //System.setProperty("webdriver.chrome.driver","/Users/harshithakeshav/Downloads/chromedriver");
            driver = new ChromeDriver();
            amazonHomePage2 = new AmazonHomePage2(driver);
            driver.get("https://www.amazon.in/");
        }

        @Test
        public void testAmazonHomePAge2(){
            amazonHomePage2.enterSearchBox("Mac Book Pro");
            amazonHomePage2.clickOnSearchButton();
        }

        @Test(enabled = false)
        public void testAmazonHomePage() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.txt_searchbox(driver).sendKeys("iphone");
        amazonHomePage.btn_searchbtn(driver).click();
        }

        @AfterSuite
        public void tearDown(){
        driver.close();
        System.out.println("Test Success");
    }
}
