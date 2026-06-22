
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int count=0;
        while(n != 0){
            n=n/10;
            count++;
        }
      int num=n;
      while(num!=0){
          int last = num%10;
          sum= sum+(int )Math.pow(last, count);
          num=num/10;
      }
      
      if(sum==num){
      System.out.println("armstrong no");
      }
      else{
          System.out.println("not a Armstrong");
      }
    }
}