package compare_excel_stable;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data {
	public static String toFind;
	public static int count;
	public static Sheet sheet;
	public static Row row;
public static boolean inputData() throws Exception, InvalidFormatException {
 
    try {

        FileInputStream fis = new FileInputStream(Main_method.KeywordPath);
        Workbook wb = WorkbookFactory.create(fis);
        sheet = wb.getSheetAt(0);
        int lastrow = sheet.getLastRowNum();
        
        System.out.println("Comparison results below....");
        System.out.println("\n" + "Total search keywords used: " + lastrow);
        
        for(count = 1;count<=lastrow;count++){  
        	        	       	
            row = sheet.getRow(count);
            toFind = row.getCell(0).toString();           
            System.out.println("\n" + count + ". Beginning test for: " + toFind);
            
    		Get_cellvalues1.readFromExcel1();				
    		Get_cellvalues2.readFromExcel2();			
    		Comparerows.comparegivenrows();
    		WriteResult.Execute();
    		
    		System.out.println("Verified upto: " + toFind);          
        }
        fis.close();
		System.out.println("\n" + "Test completed, refer excel sheet for overall results");
    } catch (IOException e) {
        System.out.println("Test data file not found");
    }

	return false;   
}
}
