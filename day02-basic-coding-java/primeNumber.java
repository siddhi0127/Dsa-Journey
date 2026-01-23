import java.util.*;
class primeNumber{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check prime or not ?");
        int n = sc.nextInt();
        int i=2;
        boolean isPrime = true;
        if(n<=1)
        {
           System.out.println("Number is non prime"); 
           return;
        }
        while(i<= n-1){
            if(n%i==0){
               isPrime=false;
            }
            i++;
        }
        if(isPrime){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is non Prime");
        }
    }
}
