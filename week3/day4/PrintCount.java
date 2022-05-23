package week3.day4;

public class PrintCount {
public static void main(String[] args) {
	String text="I am from india";
	int count=0;
	String[] split = text.split(" ");
	int length2 = split.length;
	System.out.println("split 2:"+length2);
	for (int i = 0; i < split.length; i++) {
		//System.out.println(split[i]);
	//	count=count+1;
		count++;
	}
	System.out.println(count);
	
	String text2="india";
	int length = text2.length();
	System.out.println("length: "+length);
}
}
