package FacebookTestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider {
		@Test(dataProvider = "ticketData")
		public void manySetofData(String src, String dest, String name, String email, String noOfTickets) 
	{
			System.out.println(src);
			System.out.println(dest);
			System.out.println(name);
			System.out.println(email);
			System.out.println(noOfTickets);
			System.out.println("================================");
		}
		@DataProvider
		public Object[][] ticketData() {
			Object[][] obj=new Object[4][5];
			
			obj[0][0] = "Chennai";
			obj[0][1] = "Bengaluru";
			obj[0][2] = "Monisha";
			obj[0][3] = "mailto:monisha@gmail.com";
			obj[0][4] = "2";
			
			obj[1][0] = "Coimbatore";
			obj[1][1] = "Bengaluru";
			obj[1][2] = "priya";
			obj[1][3] = "mailto:priya@gmail.com";
			obj[1][4] = "1";
			
			obj[2][0] = "Salem";
			obj[2][1] = "Bengaluru";
			obj[2][2] = "Gowsalya";
			obj[2][3] = "mailto:gowsalya@gmail.com";
			obj[2][4] = "2";
			
			obj[3][0] = "Hyderabad";
			obj[3][1] = "Bengaluru";
			obj[3][2] = "Revathi";
			obj[3][3] = "mailto:revathi@amazon.com";
			obj[3][4] = "1";
			
			return obj;
			
		}
	}



