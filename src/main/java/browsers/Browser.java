package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	private static WebDriver driver = new FirefoxDriver();
	
	public static void goTo(String url){
		driver.get(url);
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void close() {
		driver.close();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
