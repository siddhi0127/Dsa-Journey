package two_d_array;

public class diagonalTraversal {
public static void main(String[] args) {
	int arr[][]= {{1,2,3,4},
				  {5,6,7,8},
				  {9,10,11,12}};
	
	//first half
	for(int col=0;col<arr[0].length;col++) {
		int c=col;
		int r=0;
		
		while(c>=0 && r<arr.length) {
			System.out.print(arr[r][c]+" ");
			r++;
			c--;
		}
		System.out.println();
	}
		
	//second half
	for(int row=1;row<arr.length;row++) {
		int r=row;
		int c=arr[0].length-1;
		
		while(r<arr.length && c>=0) {
			System.out.print(arr[r][c]+" ");
			r++;
			c--;
		}
		System.out.println();
	}
	
}
}
