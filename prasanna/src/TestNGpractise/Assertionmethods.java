package TestNGpractise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Assertionmethods {
	@Test
	public void demo() {
		String expectedtitle ="dshop";
		String actualtitle="dwshop";
//		assertEquals(expectedtitle, actualtitle);
//		assertNotEquals(actualtitle, expectedtitle);
//		assertNull(actualtitle);
		assertNotNull(actualtitle);
		
		
		
	}

}
