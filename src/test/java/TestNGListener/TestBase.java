package TestNGListener;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		if (driver==null) {
		
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-955489057%3A1686019972410942&authuser=0&continue=https%3A%2F%2Fmail.google.com&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		}
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}

}
