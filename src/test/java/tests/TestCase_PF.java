package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.AmazonHomePage;
import pages.AmazonHomePage2;
import pages.AmazonHomePage_PF;

public class TestCase_PF {
    WebDriver driver;
    AmazonHomePage_PF amazonHomePage_pf;

    @BeforeSuite
    public void setUp(){
        String ProjDir = System.getProperty("user.dir");
        System.out.println(ProjDir);
        System.setProperty("webdriver.chrome.driver", ProjDir+"/src/test/resources/drivers/chromedriver");
        //System.setProperty("webdriver.chrome.driver","/Users/harshithakeshav/Downloads/chromedriver");
        driver = new ChromeDriver();
        amazonHomePage_pf= new AmazonHomePage_PF(driver);
        driver.get("https://www.amazon.in/");
    }

    @Test
    public void testAmazonHomePAge2(){
        amazonHomePage_pf.enterSearchBox("Mac Book Pro");
        amazonHomePage_pf.clickOnSearchButton();
    }
    @AfterSuite
    public void tearDown(){
        driver.close();
        System.out.println("Test Success");
    }
}
