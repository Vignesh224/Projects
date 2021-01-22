package compare_excel_stable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteResult {
	public static FileInputStream fin =null;
	public static FileOutputStream fout = null;
	public static Workbook wb = null;
	public static Sheet sh = null;
	public static Row row = null;
	public static Cell cell = null; 
	public static boolean Execute() {	
	
		try{
			
			fin = new FileInputStream(Main_method.KeywordPath);
			wb = WorkbookFactory.create(fin);
			sh = wb.getSheetAt(0);
			
			String Result1= "Pass";
	        String Result2= "Fail";
	        String ActualResult = Comparerows.Result; 
	        
//	        System.out.println("Actual result: " + ActualResult);
//	        String ActualResult = "Fail";
	        
			if(sh==null) return false;
			else {
				int i = Data.count;
				row = sh.getRow(i);
				for(int c=1;c<=1;c++)
				{					
					 
		            if(Result1.equalsIgnoreCase(ActualResult)) 
		            {
		            	cell = row.createCell(c);
		            	cell.setCellValue("Identical");		   
 
					}
		            
					else if(Result2.equalsIgnoreCase(ActualResult))
					{	
						cell = row.createCell(c);
						cell.setCellValue("Mismatch Found");
					}
		            
					else 
					{
						cell = row.createCell(c);
						cell.setCellValue("Unknown error");
					}
		            
//		            System.out.println("Compared data upto row index " + i);
		            
				}
			fout = new FileOutputStream(Main_method.KeywordPath);
			wb.write(fout);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{				
				fin.close();
				fin = null;
				fout.flush();
				fout.close();
				fout = null;
				cell = null;
				row = null;
				sh = null;
//				wb.close();
				wb=null;			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return false;		

	}
}
