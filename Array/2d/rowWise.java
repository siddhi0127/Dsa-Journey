package two_d_array;

public class rowWise {
public static void main(String[] args) {
	int arr[][]= {{1,2,3,4,5},
				  {8,9,0,1,2},
				  {3,3,4,5,6}}; //1 8 32 
	
	for(int col=0;col<arr[0].length;col++) {
		for(int row=0;row<arr.length;row++) {
			System.out.print(arr[row][col]+" ");
		}
		System.out.println();
	}
	
}
}
