package FstTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@AfterSuite
	public void lastexecution()
	{
		System.out.println("At after test , I will exicute at the last tp close the open browser############");
	}

	@Test
	public void demo()

	{
		System.out.println("testNG is working test 1 ");
	}

	@Test
	public void test01()

	{
		System.out.println("test is working fine test 1 ");
	}

	@Test
	public void test02()

	{
		System.out.println("test 02 is working fine test 1 ");
	}

}