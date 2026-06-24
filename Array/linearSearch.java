package basic;

public class linearSerach 
{
public static void main(String args[])
{
	int target=5;
	int arr[]= {2,3,8,-1};
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==target)
		{
			System.out.println(i);
			break;
		}
		
	}
	Target(arr);
	//System.out.println("element not found");
	
}
 public static void Target(int arr[])
 {
	 int sum=0;
	 int target=5;
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=i+1;j<arr.length;j++)
		 {
			sum=arr[i]+arr[j];
			if(sum==target)
			{
				System.out.println("target values found at index:"+i+" "+j);
				System.out.println("sum of that two numbers:"+sum);
				break;
			}
			
		 }
		 
		 
	 }
	 
 }
}
