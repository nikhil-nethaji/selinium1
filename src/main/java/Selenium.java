import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
		
		// declaration and instantiation of objects/variables
		String path = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();  
	    driver.manage().window().maximize();
	    // Launch website  
	    driver.navigate().to("https://www.myworkday.com/northeastern/d/home.htmld"); 
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("surampudi.v");
	    driver.close();
	    

	}

}
