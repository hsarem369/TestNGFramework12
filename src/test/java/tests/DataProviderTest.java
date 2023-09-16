package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "data")
	public void test(String username , String password) {
		
		System.out.println(username);
		System.out.println(password);
	
	}
	
	 @DataProvider(name = "data")
		public Object testData() {
			
			Object [][]	data = new Object[2][2];
			
			data[0][0]= "user1";
			data[0][1] = "pass1";
			
			data[1][0] = "user2";
			data[1][1] = "pass2";
					
			
			return data;
			
			
			
			
		}
	}


