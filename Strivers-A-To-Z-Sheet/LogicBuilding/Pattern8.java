public class Pattern8{
  public static void main(String args[]){
    int n=5;
    for(int i=n ; i>=1 ;i++){
      //space
      for(int space=1 ; space<=n-i;space++){
        System.out.print(" ");
      }
      //star
      for(int star=1;star<=i*2-1 ; star++){
        System.out.print("*");
      }
      //space
      for(int space=1;space<=n-i;space++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
