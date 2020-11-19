package FstTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups = {"Smoke"})
	public void demo1()

	{
		System.out.println("testNG is working test 2.........part of smoke ");
	}
    @Parameters({"URL","UserName","Password"})     //put your data here frm XML file to fatch the value (Multiple data)  
	@Test
	public void test02(String urlname,String key,String key01)      //here put the value name in a string variable and can print it or call it 

	{
		System.out.println("test is working fine test 2 ");
		System.out.println(urlname);        //tacking the data frm testng.xml - URL
		System.out.println(key);           //tacking the data frm testng.xml - username
		System.out.println(key01);        //tacking the data frm testng.xml - PW
	}
    @Test(dataProvider ="getData")   //use dataProvider to get the data frm the array list by using getdata in double quites
	public void MobileLoginCarlone(String username ,String Password)     //using the string for cathing the data from get data

	{
		System.out.println("test is working fine test 2*******#####******* ");
		System.out.println(username);
		System.out.println(Password);
	}
    
    
    @DataProvider
    public Object[][] getData()
    {
    	//if we have 3 combination of test data
    	Object [][] data = new Object [3][2];    //create multidimenson array list, for each 3 combination we have 2 values  
    	   //1st set
    	   data[0][0] = "FstUserName!!!!!!!!!!!!";
    	   data[0][1] = "1stPassword!!!!!!!!!!!!";
    	   
    	   //2nd set
    	   data[1][0] = "SecUserName!!!!!!!!!!!!";
    	   data[1][1] = "2ndPassword!!!!!!!!!!!!";
    	   
    	   //3rd set
    	   data[2][0] = "thirdUserName!!!!!!!!!!!!";
    	   data[2][1] = "3rdPassword!!!!!!!!!!!!";
    	   return data;
    	   
    }
    

}
