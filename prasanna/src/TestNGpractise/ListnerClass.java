package TestNGpractise;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerImplementation.class)
public class ListnerClass {
	@Test
	public void sample() {
		System.out.println("from testcases");
//		assertTrue(false);
		
		
	}

}
