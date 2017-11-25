package imdb;

import org.junit.Test;

public class ImdbTest extends ParentTest{
	
	@Test
	public void testSearchMovie() {
		navigateToPage("http://imdb.com");
		validatePage();
		searchMovie();
		validateMovieExists();
	}
	
	
	@Test
	public void testPlayTrailer() {
		navigateToPage("http://imdb.com");
		validatePage();
		searchMovie();
		validateMovieExists();
		selectMovie();
		validateCorrectMovie();
		playTrailer();
		
		
	}
	
	

	@Test
	public void testValidateMovieStars() {
		navigateToPage("http://imdb.com");
		validatePage();
		searchMovie();
		validateMovieExists();
		selectMovie();
		validateCorrectMovie();
		validateMovieStars();
	}

	

}
