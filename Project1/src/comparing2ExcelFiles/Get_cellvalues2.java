package compare_excel_stable;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellReference;

public class Get_cellvalues2 {
	public static int a1, b1;
	static boolean readFromExcel2()	{
		FileInputStream fin = null;
		try {
			String keyword = Data.toFind;
			fin = new FileInputStream(Main_method.Excel2Path);
			Workbook wb = WorkbookFactory.create(fin);
			DataFormatter formatter = new DataFormatter();
			Sheet sheet = wb.getSheetAt(0);
			for (Row row : sheet) {
			    for (Cell cell : row) {		
			    	
//			        CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
			       
			        // get the text that appears in the cell by getting the cell value and applying any data formats (Date, 0.00, 1.23e9, $1.23, etc)
			        String text = formatter.formatCellValue(cell);

			       // Position for data in excel 2 in case of exact match
			        if (keyword.equals(text)) {	
			        		System.out.println("Match found in Excel_2");
				            a1 = row.getRowNum();
				            b1 = cell.getColumnIndex();					       
//				           System.out.println("Row, column indices for 2nd data be: " + a1 + ", " + b1);	  		           			   			        
			        }
			        
			        // Is it a partial match?
//			        else if (text.contains(keyword)) {
//			        	
//			        System.out.println("Keyword partially matches" + cellRef.formatAsString());
//
//			        }	
			        
			        // When no match found
//			        else {
//			        	
//			        System.out.println("No match found in Excel_2");
//
//			        }
			    }
			}						
			return true;
			
			}catch(Exception e)
			{
			e.printStackTrace();
			return false;
			}
			finally
			{
			try{
				
			fin.close();
			
			}catch(Exception e)
			{
			e.printStackTrace();
			}
			}
			}
			
	} 