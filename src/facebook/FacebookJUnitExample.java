package facebook;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class FacebookJUnitExample extends FacebookBaseTest{
	
	@Test
	@FileParameters("./data/params.csv")
	public void testFacebookLogin(String browser, String url,
			String user, String password, String friendName) {
		
		setUp(browser, url);
		
		logIntoFacebook(user, password);
		
		searchFacebookFriend(friendName);
		
		gotoPhotos();
		
		likeAllPhotos();
		
		
		
		
	}

	

	

}
