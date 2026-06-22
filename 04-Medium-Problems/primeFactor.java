import java.util.*;
class primeFactor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num : ");
        int n=sc.nextInt();
        int i=2;
        while(n !=0){
            if(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            else{ i++;}
        }

    }
}