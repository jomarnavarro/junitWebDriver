package imdb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentTest {
	
	protected WebDriver driver;
	
	@Before
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	protected void validateMovieExists() {
		// TODO Auto-generated method stub
		
	}

	protected void searchMovie() {
		// TODO Auto-generated method stub
		
	}

	protected void validatePage() {
		// TODO Auto-generated method stub
		
	}

	protected void navigateToPage(String url) {
		// TODO Auto-generated method stub
		driver.navigate().to(url);
	}
	
	protected void playTrailer() {
		// TODO Auto-generated method stub
		
	}

	protected void validateCorrectMovie() {
		// TODO Auto-generated method stub
		
	}

	protected void selectMovie() {
		// TODO Auto-generated method stub
		
	}
	
	protected void validateMovieStars() {
		// TODO Auto-generated method stub
		
	}


}
