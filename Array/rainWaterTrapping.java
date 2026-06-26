package logic_building;

public class rainWaterTrapping {
	public static void main(String[] args) {
		
		int arr[] = {4,2,0,3,2,5};
		int n=arr.length;
		int leftMax[]=new int[n];
		int rightMax[]=new int[n];
		checkCountTrappedRain(arr,leftMax,rightMax,n);
			
	}
	
	public static void checkCountTrappedRain(int arr[],int leftMax[],int rightMax[],int n) {
		
		leftMax[0]=arr[0];
		for(int i=1;i<n;i++) {
			leftMax[i]=Math.max(leftMax[i-1],arr[i]);
		}
		
		rightMax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rightMax[i]=Math.max(rightMax[i+1],arr[i]);
		}
		
		int waterTrap=0;
		int totalWater=0;
		for(int i=0;i<n;i++) {
			waterTrap=Math.min(leftMax[i],rightMax[i]);
			 totalWater += waterTrap-arr[i];
		}
		
		System.out.println("Total water Trapped : "+totalWater);
	}

}

