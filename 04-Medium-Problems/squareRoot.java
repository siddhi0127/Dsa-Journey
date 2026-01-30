public class squareRoot{
  static int floorSquare(int n){
    int res=1;
    while(res * res <= n){
      res++;
    }
    return res-1;
  }
  public static void main(String args[]){
    int n=10;
    System.out.println("Square root of "+n+" : "+floorSquare(n));
  }
}
