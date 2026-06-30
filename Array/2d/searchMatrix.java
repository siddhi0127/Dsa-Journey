package two_d_array;

public class searchMatrix {
public static void main(String[] args) {
	int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	int target=3;
	//System.out.println(HalfBSearchMatrix(arr,target));
	if(BinarySearchMatrix(arr,target)) {
		System.out.println("Target found");
	}
	else {
		System.out.println("Target not found ");
	}
}

public static boolean HalfBSearchMatrix(int arr[][],int target) {
	for(int row=0;row<arr.length;row++) {
		int s=0;
		int e=arr[0].length-1;
		
		while(s<=e) {
			int mid=(s+e)/2;
			if(arr[row][mid]==target) {
				System.out.println("Found at row "+row+" column "+mid);
				return true;
			}
			else if(target < arr[row][mid]) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
	}
	return false;
}

public static boolean BinarySearchMatrix(int arr[][],int target) {
	int m=arr.length;//row
	int n=arr[0].length;//column
	
	int s=0;
	int e=(m*n)-1;
	
	while(s<=e) {
		int mid=(s+e)/2;
		
		int row=mid/n;
		int col=mid%n;
		
		if(arr[row][col]==target) return true;
		else if(arr[row][col]>target) e=mid-1;
		else s=mid+1;
	}
	return false;
}

}
