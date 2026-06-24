package basic;

public class sum_of_subarry 
{
public static void main(String[] args) {
	int arr[]= {7,-8,4,7,-9};

	int max=Integer.MIN_VALUE;

	
	// Using Kaden's Algorithm
	int currsum=0;
	for(int i=0;i<arr.length;i++)
	{
		currsum=currsum+arr[i];
		max=Math.max(max, currsum);
		if(currsum<0)
	        currsum=0;
	}
	System.out.println(max);
	
}
}
