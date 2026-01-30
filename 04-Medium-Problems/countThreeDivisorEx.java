public class countThreeDivisorEx{
    static int countThreeDivisor(int n){
      //To count exact 3 divisor for specific range 
      //Sqaure and Square Root of Prime number has exactly 3 divisor.
        int result=0;
      //Use i*i to check that number divisor is within range or not
        for(int i=2;i*i<=n;i++){
            if(isPrime(i)){
                result ++;
            }
        }
        return result;
      // Returning the count of exact 3 divisor as result 
    }
    static boolean isPrime(int n){
      //To check whether number is prime or not
        if(n<2){
            return false;
        }
      // loop will iterate upto i*i 
      //to check divisability upto i^2
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n=100;
        System.out.println("Count of Numbers who have exact 3 divisor from 1 to "+n+" : "+countThreeDivisor(n));
    }
}
