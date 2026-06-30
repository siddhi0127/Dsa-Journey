package string;

public class StringBasic2 {
public static void main(String[] args) {
	AsciiVal();
	isPalindrome();
	stringReverse();
}
public static void AsciiVal() {
	char s=' ';
	int n1=(int)s;
	System.out.println(" 2] space ascii value : "+n1);
}

public static void isPalindrome() {
	String str1="ABCD";
	char ch[]=str1.toCharArray();
	int n=str1.length();
	int l=0;
	int r=n-1;
	
	char reversed[]=new char[n];
	while(l<=r) {
		reversed[l]=ch[r];
		reversed[r]=ch[l];
	
		l++;
		r--;
	}
	System.out.println("3] Swapped Elements : ");
	for(int i=0;i<ch.length;i++) {
		System.out.print(ch[i]+" ");
	}
	System.out.println();
	String original=str1;
	String reversedStr=new String(reversed);
	if(original.equals(reversedStr)) {
		System.out.println("It is palindrome");
	}else {
		System.out.println("not palidrome");
	}
}

public static void stringReverse() {
	String str2="hello world java";
	String ans[]=str2.split(" ");
	int n=ans.length-1;
	for(int i=n ;i>=0;i--) {
		System.out.print(ans[i]+" ");
	}
}


}
