public class findGCD{
  static int cal_gcd(int a,int b){
    //Math.min() is inbuilt function and used to find out the minimum value between a and b
    int result=Math.min(a,b);
    while(result>0){
      //if result divides both numbers,it is commonn divisor
      if(a% result==0 && b% result==0){
        //break because we want highest common factor 
        break;
      }
     //decrement result to check the nnext smaller possible divisor
      result--;
    }
    //here returning the result as GCD
    return result;
  }

  public static void main(String args[]){
    int a=20,b=28;
    //calling the static user defined function to print the GCD
    System.out.println("GCD of "+a+" and "+b+" : "+cal_gcd(a,b));
    
  }
}
