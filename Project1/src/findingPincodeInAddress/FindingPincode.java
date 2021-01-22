package findingPincodeInAddress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingPincode {

// To find 6 digit pincode in given address and to print that pincode 
// Note: 
//	1. This program can be used to find pincodes with & without single spaces in between their 3rd & 4th digits 
//	   (ie, 600 201 & 600201)
//	2. Applicable only for Addresses within India   
	
	public static void main(String[] args) {
		
try {
			
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter your address (within India): ");  
			String Address = sc.nextLine();  
			
			Pattern p = Pattern.compile("[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}");
			Matcher m = p.matcher(Address);
	
			 int count = 0;
			

			 do 
			 {
				 if (m.find())
				 {
					 System.out.println ("Pincode is present"); 
			
				 }
			 else 
			 { 
				 System.out.println ("Pincode not present"); 
			 }
				 
			 }
			while (m.find()) ;
			{
	            count++;
	            System.out.println("found: " + count + " : "
	                   + m.group() );
			}
			
		
	
			
			
			
			sc.close();
			
			
	}

		catch (Exception e) {
		System.out.println(e.getMessage() + "\n" + e.getStackTrace());	
		}		

	}

}
