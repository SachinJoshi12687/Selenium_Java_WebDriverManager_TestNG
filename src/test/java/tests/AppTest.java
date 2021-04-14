package tests;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void SampleSeleniumTest()
    {
    	// TODO Auto-generated method stub
    			WebDriverManager.chromedriver().setup();
    			WebDriver driver = new ChromeDriver();
    			driver.get("http://google.com");
    			System.out.println("running AppTest !!");
    			try {
    				Thread.sleep(5000);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			driver.manage().window().maximize();
    			try {
    				Thread.sleep(5000);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			
    			driver.findElement(By.name("q")).sendKeys("test me !");
    			try {
    				Thread.sleep(5000);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			driver.close();
    			driver.quit();
    }
}
