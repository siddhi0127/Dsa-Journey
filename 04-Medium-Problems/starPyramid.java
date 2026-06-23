package basic;

public class starPyramid {
public static void main(String args[]) {
	int n=5;
	int ss=2*n-3;
	//row
	for(int row=1;row<=n;row++) {
		//star1
		for(int star1=1;star1<=row;star1++) {
			System.out.print("* ");
		}
		
		//Space
		for(int space=1;space<=ss;space++) {
			System.out.print("  ");
		}
		
		//star2
		for(int star2=1;star2<=row;star2++) {
			if(row==n && star2==row) {
				
			}
			else {
				System.out.print("* ");
			}
		}
		
		System.out.println();
		ss=ss-2;
	}
}
}
