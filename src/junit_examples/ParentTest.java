package junit_examples;

import org.junit.After;
import org.junit.Before;

public class ParentTest {
	@Before
	public void setUp() {
		//do something
		System.out.println("Set up");
	}
	
	@After
	public void tearDown() {
		System.out.println("Tear Down");
	}

}
