package weel4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintNumberInList {
public static void main(String[] args) {
	List<Integer> num=new ArrayList<Integer>();
	num.add(1);
	num.add(3);
	num.add(4);
	num.add(6);
	num.add(2);
	num.add(5);
	num.add(7);
	num.add(8);
	System.out.println(num);
	
	int size = num.size();
	
//	for (int i = 0; i < size; i++) {
//		Integer integer = num.get(i);
//		System.out.println(integer);
//		
//	}
	
	
	for (Integer integer : num) {
		System.out.println(integer);
	}
	Collections.sort(num);
	
	System.out.println(num);
	
	Collections.reverse(num);
	System.out.println(num);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
