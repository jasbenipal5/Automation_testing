package Project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	public class class1 {
		    @BeforeClass
		    void setUpClass() {
		        System.setProperty("webdriver.chrome.driver", "C://Users//localadmin//Downloads//chromedriver_win32//chromedriver.exe");
		        // beforeclass action to link the driver
		    }
		    @Test
		    public void testlogo() throws Exception{
		        System.setProperty("webdriver.chrome.driver", "C://Users//localadmin//Downloads//chromedriver_win32//chromedriver.exe");
		        ChromeDriver driver = new ChromeDriver();
		        driver.get("http://book.theautomatedtester.co.uk/");	       
		        String actualTitle = "Selenium: Beginners Guide";
		        //title on the site
		        Assert.assertEquals(driver.getTitle(), actualTitle);
		        WebElement logo = driver.findElement(By.className("mainheading")  );
		        Assert.assertEquals(true, logo.isDisplayed());
		        //checking the logo 
		        System.out.println("logo passed");
		    }
}