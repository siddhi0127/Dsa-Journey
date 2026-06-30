package string;

public class kokoEatingBananas {
public static void main(String[] args) {
	int piles[]= {3,6,7,11};
	int h=8;
	
	int k=minEatingSpeed(piles,h);
	System.out.println("Minimum eating speed : "+k);

}

public static int minEatingSpeed(int[] piles, int h) {
    int f=1;
    int high =maximumElement(piles);
    int ans=-1;
    while(f<high) {
    int 	mid=(f+high)/2;
    int hour=calculateSpeed(piles,mid);
    if(hour<=h) {
    	ans=mid;
    	high=mid-1;
    }
    else {
    	f=mid+1;
    }
    }
    return ans;
}
public static int maximumElement(int[] piles) {
	int max=Integer.MIN_VALUE;
	
	for(int i=0;i<piles.length;i++) {
		if(piles[i]>max) {
			max=piles[i];
		}
	}
	return max;
}

public static int calculateSpeed(int piles[],int mid) {
	int total=0;
	for(int p:piles) {
		total+=Math.ceil(((double)p/mid));
	}
	return total;
}
}
