// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class countDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        while(n != 0){
            n=n/10;
            count++;
        }
        System.out.println("count :"+count);
  
    }
}