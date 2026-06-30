package string;

public class StringBasic {
public static void main(String[] args) {
	String s="Siddhi";
	
	//character
	System.out.println(s.charAt(3));
	
	//length
	System.out.println(s.length());
	
	System.out.println();
	//substring 
	System.out.println(s.substring(1, 4));
	System.out.println(s.substring(2));
	
	//toCharArray
	char ch[]=s.toCharArray();
	System.out.println("Displaying toCharArray() : ");
	Display(ch);

	//trim
	System.out.println(s.trim());
	//replace
	System.out.println(s.replace("i", "y"));
	
	
	String str1="ABC";
	String str2="ABC";

	String s1=new String("ABC");
	String s2=new String("ABC");
	
	//String literal
	if(str1==str2) {
		System.out.println("reference / memory address is same");
	}
	else {
		System.out.println("Not reference / memory address is same");
	}
	if(str1.equals(str2)) {
		System.out.println("Values are same");
	}
	else {
		System.out.println("Values are not same");
	}
	
	//new keyword
	if(s1==s2) {
		System.out.println("str reference / memory address is same");
	}
	else {
		System.out.println("str ref not same");
	}
		
	if(s1.equals(s2)) {
		System.out.println("str Values are same");
	}else {
		System.out.println("str values are not same");
	}
	
}

public static void Display(char ch[]) {
	for(int i=0;i<ch.length;i++) {
		System.out.print(ch[i]+" ");
	}
	System.out.println();
}
}
