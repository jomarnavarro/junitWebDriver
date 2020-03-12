package imdb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class ParentTest {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	@Before
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 5);		
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	protected void validateMovieExists(String movieName) {
		// TODO Auto-generated method stub
		WebElement resultado = driver.findElement(By.linkText(movieName));
		wait.until(ExpectedConditions.visibilityOf(resultado));
		assertTrue(resultado.isDisplayed());
	}
	protected void searchMovie(String movieName) {

		//encontrar el campo de busqueda name= "q"
		WebElement campoBusqueda = driver.findElement(By.name("q"));
		campoBusqueda.sendKeys(movieName);
		//encontrar el boton de busqueda id="navbar-submit-button
		WebElement botonBusqueda = driver.findElement(By.id("navbar-submit-button"));
		botonBusqueda.click();
	}
	//Econtrar el campo busqueda

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

	protected void selectMovie(String movieName, String movieYear) {
		// encontramos un elemento cuyo link diga 'movieName' y cuyo anio coincida con movieYear
		String xpathResultado = "//td[contains(., '" + movieName + " (" + movieYear+ ")')]/a";
		WebElement peliculaCorrecta = driver.findElement(By.xpath(xpathResultado));
		peliculaCorrecta.click();

		// TODO Auto-generated method stub
		
	}
	
	protected void validateMovieStars() {
		// TODO Auto-generated method stub
		
	}


}
