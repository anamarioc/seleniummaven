package selenium;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.*;



public class TestFFOnGrid {
	@Test
	public static void main() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","https://github.com/Ferreiracn/seleniummaven");
		DesiredCapabilities cap=  DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WIN10);
		cap.setBrowserName("chrome");
		String url= "http://localhost:4444/wd/hub";
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	
}
