public class kthdigitEx{
  static int kthdigit(int a,int b,int k){
    int power=(int)Math.pow(a,b);

    for(int i=1;i<k;i++){
      power=power/10;
    }
    return power%10;
  }
  public static void main(String args[]){
    int a=3,b=3,k=1;
    System.out.println("Kth position value in 'a' raised to 'b' :"+kthdigit(a,b,k));
  }
}
