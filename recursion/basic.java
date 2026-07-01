package recursion;

public class basic {
public static void main(String[] args) {
	System.out.println("Hello");
	display(1,3);
	System.out.println("Exited from function");
}

//public static void display() {
//	System.out.println("Good Morning !");
//	display();
//}

//public static void display() {
//	System.out.println("Good Morning !");
//	display();
//	System.out.println("Good night !");
//}

//public static void display(int i,int n) {
//	System.out.println("Good Morning !");
//	display(i+1,n);
//}

public static void display(int i,int n) {
	if(i<=n) {
		System.out.println("Good Morning ! "+i);
		display(i+1,n);
	}
	System.out.println("Good night ! "+i);
	
}


}
