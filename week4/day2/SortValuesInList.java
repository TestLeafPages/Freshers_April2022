package weel4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortValuesInList {
public static void main(String[] args) {

	  // Aspire Systems,CTS, Wipro, HCL 
	  //Output: Wipro, HCL , CTS, Aspire Systems
	
	List<String> company=new ArrayList<String>();
	company.add("Aspire Systems");
	company.add("Wipro");
	company.add("HCL");
	company.add("CTS");
	System.out.println(company);
	Collections.sort(company);
	System.out.println(company);
	Collections.reverse(company);
	System.out.println(company);
}
}
