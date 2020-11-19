package FstTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("****i will run before every method****");
	}
	
	@Test(groups = {"Smoke"})
	public void WebloginCarlone()

	{
		System.out.println("testNG is working test 3......part of smoke ");
	}
    
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("####I will run after every method####");
	}
	
	
	@Test
	public void MobileLoginCarlone()

	{
		System.out.println("test is working fine test 3 ");
		//Assert.assertTrue(false);      // for valideting the conditio
	}

	@Test
	public void LoginAPICarlone()

	{
		System.out.println("test is working fine test 3 ");
	}
    @BeforeSuite
    public void precondition()
    {
    	System.out.println("At Before test will run fst apart frm any other to clear the data**********");
    }

}
