package TestNGListener;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest  extends TestBase{
	
	@Test
	public void doLogin() {
		
		
		driver.findElement(By.id("identifierId")).sendKeys("vallepu.pranaykumar123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	}

}
