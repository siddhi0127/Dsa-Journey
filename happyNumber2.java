package basic;

import java.util.Scanner;

public class HappyNumber 
{
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num :");
	int n=sc.nextInt();
	
	if(isHappy(n)) {
		System.out.println("Number is happy  "+n);
	}
	else {
		System.out.println("Number is unhappy");
	}
	
}

public static int getNextSum(int n) {
	int sum=0;
	while(n>0) {
		int ld=n%10;
		sum=(int) (sum+Math.pow(ld,2));
		n=n/10;
	}
	return sum;
}

public static boolean isHappy(int n) {
	int nn=n;
do{

n=getNextSum(n);
nn=getNextSum(getNextSum(n));
}while(n!=nn);

return n==1;
}
}