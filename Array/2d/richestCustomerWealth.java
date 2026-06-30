package two_d_array;

import java.util.Scanner;

public class richestCustomerWealth {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row and column value : ");
	int row=sc.nextInt();
	int col=sc.nextInt();
	
	int arr[][]=new int[row][col];
	
	System.out.println("Enter values : ");
	
	for(int r=0;r<row;r++) {
		for(int c=0;c<col;c++) {
			arr[r][c]=sc.nextInt();
		}
	}
	
	int ans =Display(arr);
	System.out.println(ans);
	
}

public static int Display(int arr[][]) {

	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=0;j<arr[0].length;j++) {
			sum=sum + arr[i][j];
		}
		max=Math.max(max,sum);
		
	}
	return max;
}
}
