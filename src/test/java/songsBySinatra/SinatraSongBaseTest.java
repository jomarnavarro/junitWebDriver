package songsBySinatra;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;

public class SinatraSongBaseTest {
	
	protected WebDriver driver;
	public static final String WINDOWS_DRIVER_PATH = "C:\\Windows\\";
	public static final String UNIX_DRIVER_PATH = "/usr/local/bin/";
	
	public void setUp(String browser, String url) {
		driver = startBrowser(System.getProperty("os.name"), browser);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	private WebDriver startBrowser(String osName, String browserName) {
		String basePath = "";
		String fileExt = "";
		String execName = "";
		if(osName.startsWith("Windows")) {
			basePath = WINDOWS_DRIVER_PATH;
			fileExt = ".exe";
		}
		else {
			basePath = UNIX_DRIVER_PATH;
		}

		if (BrowserType.FIREFOX.equals(browserName)) {
			execName = "geckodriver";
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_XPI_PROPERTY, basePath + execName + fileExt);
			return new FirefoxDriver();
		} else if (BrowserType.SAFARI.equals(browserName)) {
			execName = "safaridriver";
			System.setProperty("webdriver.safari.driver", basePath + execName + fileExt);
			return new SafariDriver();
		} else if (BrowserType.EDGE.equals(browserName)) {
			execName = "msedgedriver";
			System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, basePath + execName + fileExt);
			return new EdgeDriver();
		} else {
			execName = "chromedriver";
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, basePath + execName + fileExt);
			return new ChromeDriver();
		}
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

	public void validateUserLogged(String user) {
	}

	public void logIntoSinatra(String user, String password) {
	}

}
