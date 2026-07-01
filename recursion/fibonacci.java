package recursion;

public class fibonacci {
public static void main(String[] args) {
	int n=6;
	
	for(int i=0;i<n;i++) {
		System.out.print(calFib(i)+" ");

		}
	}

public static int calFib(int n) {
	if(n==0)return 0;
	if(n==1)return 1;
	return calFib(n-1)+calFib(n-2);
	
}
}
