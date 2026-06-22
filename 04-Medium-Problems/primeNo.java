import java.util.*;
class primeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        Boolean t=true;
        for(int i=2;i<=n-1;i++){
            if (n%i==0){
                t=false;
                break;
            }
        }
        if(t==true){
            System.out.println("Prime no");
        }
        else{
            System.out.println("nonPrime no");
        }
    }
}