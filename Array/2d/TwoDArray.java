package two_d_array;

import java.util.*;

public class TwoDArray {
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
		
		Display(arr);
		
	}
	
	public static void Display(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
