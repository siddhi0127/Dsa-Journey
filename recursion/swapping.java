package recursion;

public class swapping {
public static void main(String[] args) {
	String str="HELLO";
	char ch[]=str.toCharArray();
	int i=0;
	int j=ch.length-1;
	swap(i,j,ch);
	for(int k=0;k<ch.length;k++) {
		System.out.print(ch[k]+" ");
	}
}//main ends

public static void swap(int i,int j,char ch[]) {
	if(i<=j) {
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		swap(i+1,j-1,ch);
	}
}//function ends

}//class ends
