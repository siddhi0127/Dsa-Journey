import java.util.*;
class closestNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Target number :");
        int target=sc.nextInt();
        int i=1,bef_no=0,aft_no=1,fib_val;
    
        while(aft_no<target){
            fib_val=bef_no+aft_no;
            bef_no=aft_no;
            aft_no=fib_val;
        }
        
        int bef_near=target - bef_no;
        int aft_near=aft_no - target;
        
        if(bef_near < aft_near){
            System.out.println("Closest number is : "+bef_no);
        }
        else{
            System.out.println("Closest number is : "+aft_no);
        }
        
    }
}
