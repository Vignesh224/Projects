package compare_excel_stable;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Main_method {
	
	public static String KeywordPath;
	public static String Excel1Path;
	public static String Excel2Path;
	
	public static void main(String[] args) throws  Exception, InvalidFormatException{
		
		KeywordPath = "D:\\S.Vignesh\\eclipse-workspace\\Compare excel data\\Test data\\Search keyword & results.xlsx";
		Excel1Path = "D:\\S.Vignesh\\eclipse-workspace\\Compare excel data\\Test data\\Excel_1.xlsx";
		Excel2Path = "D:\\S.Vignesh\\eclipse-workspace\\Compare excel data\\Test data\\Excel_2.xlsx";
		
		Data.inputData();
		
//		Note: 
//		1. Comparison function is sensitive to spaces, ie., spaces in between will not be trimmed 
//		during data comparison and also case sensitive.	
//		2. In case of duplicates, comparison will be done for last data within the duplicates.
//		3. Search and Comparison actions will be performed on data provided at first sheet in all excel files 

	}

}
