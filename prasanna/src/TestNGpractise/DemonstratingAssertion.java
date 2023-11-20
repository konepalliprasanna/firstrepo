package TestNGpractise;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemonstratingAssertion {
	@Test
	public void demo() {
		String expectedtitle ="demo";
		String actualtitle = "sample";
		
//		hard assert
//		assertEquals(actualtitle, expectedtitle);
		
//		 soft assert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualtitle, expectedtitle);
		System.out.println("done");
		soft.assertAll();
		
	}

}
