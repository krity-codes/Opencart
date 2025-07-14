package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	//DatProvider 1
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String path=".\\testData\\OpenCartLoginData.xlsx";  //taking excel from testData 
		ExcelUtility util=new ExcelUtility(path);          //creating an object for ExcelUtility
		
		int totalrows=util.getRowCount("Sheet1");
		int totalcols=util.getCellCount("Sheet1", 1);
		
		String loginData[][]=new String[totalrows][totalcols];  //created for 2D array which can store the user and password info
		
		for(int i=1;i<=totalrows;i++)  //1   read the data from excel storing from 2D array
		{
			for(int j=0;j<totalcols;j++) //0  i is rows j is cols
			{
				loginData[i-1][j]=util.getCellData("Sheet1", i, j); //1,0
			}
		}

		return loginData; //returning 2D array
		
	}

	
	//DatProvider 2
	
	//DatProvider 3
	
	//DatProvider 4

}