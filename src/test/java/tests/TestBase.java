package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
		public static WebDriver driver;

		public static void initDriver() {
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://techfios.com/billing/?ng=login/");
		}
		
//		public void takeScreenshot(WebDriver driver) {
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//			String currentDirectory = System.getProperty("user.dir");
//			SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
//			Date date = new Date();
//			String label = formatter.format(date);
//			FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/" + label + ".png"));
//			
//		}


}
