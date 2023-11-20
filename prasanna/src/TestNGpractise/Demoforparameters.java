package TestNGpractise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demoforparameters {

	@Test()
	@Parameters("sample")
	public void demo(String data) 
	{
		System.out.println("done");
		System.out.println(data);
	}


}
