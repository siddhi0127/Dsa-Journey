import java.util.*;
public class fibonacciSeries{
    public static void main(String s[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        n=sc.nextInt();
        int n1=0,n2=1,n3;
        for(int i=1;i<=n;i++){
        System.out.println(n1);
        n3=n1+n2;
        n1=n2;
        n2=n3;
        }
        
    }
}
