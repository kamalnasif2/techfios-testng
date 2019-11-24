package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {
	@Test
	public void openGoogleSite() {
		
		// Setting ChromeDriver Properties
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		// Create an object of chromeDriver and will open chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		//  Go to GoogleSite
		driver.get("https://www.google.com/");
		
}}
