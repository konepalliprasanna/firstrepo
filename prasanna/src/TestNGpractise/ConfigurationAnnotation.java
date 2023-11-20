package TestNGpractise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	@BeforeSuite
	public void beforesuite() 
	{
		System.out.println("from beforesuite");
	}
	@BeforeTest
	public void beforetest() 
	{
		System.out.println("from beforetest");
	}
	@BeforeClass
	public void beforeclass() 
	{
		System.out.println(" from beforeclass");
	}
	@BeforeMethod
	public void beforemethod() 
	{
		System.out.println(" from beforemethod");
	}
	@Test
	public void method1(){
		System.out.println("from method1");
	}
	@AfterSuite
	public void aftersuite() 
	{
		System.out.println("from aftersuite");
	}
	@AfterTest
	public void aftertest() 
	{
		System.out.println("from aftertest");
	}
	@AfterClass
	public void afterclass() 
	{
		System.out.println(" from afterclass");
	}
	@AfterMethod
	public void aftermethod() 
	{
		System.out.println(" from aftermethod");
	}
	@Test
	public void method2(){
		System.out.println("from method2");
	}
	
}
