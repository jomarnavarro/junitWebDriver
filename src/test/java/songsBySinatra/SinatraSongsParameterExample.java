package songsBySinatra;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class SinatraSongsParameterExample extends SinatraSongBaseTest {
	
	@Test
	@FileParameters("./data/params.csv")
	public void testSinatraLogin(String browser, String url,
			String user, String password) {
		setUp(browser, url);
		logIntoSinatra(user, password);
		validateUserLogged(user);
	}
}
