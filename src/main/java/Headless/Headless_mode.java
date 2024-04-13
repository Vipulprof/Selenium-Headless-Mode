package Headless;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_mode {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);
		options.addArguments("--headless=new");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://dev.cloudpokernight.com/");
		driver.manage().window().maximize();
		
		System.out.println("Title of the page:"+driver.getTitle());		
		driver.quit();
		

}
}