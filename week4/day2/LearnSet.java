package weel4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	Set<String> name=new HashSet<String>();
	//Set<String> name=new TreeSet<String>();
	//Set<String> name=new LinkedHashSet<String>();
	name.add("Akash");
	name.add("Sanjay");
	boolean add = name.add("vignesh");
	System.out.println(add);
	name.add("Vel");
	name.add("Prakash");
	name.add("Manikandan");
	boolean add2 = name.add("vignesh");
	System.out.println(add2);
	
	//[Akash, vignesh, Vel, Manikandan, Sanjay, Prakash]-hashset
	//[Akash, Manikandan, Prakash, Sanjay, Vel, vignesh]-treeset
	System.out.println(name);
}
}