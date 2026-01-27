public class validTriangle{
  public static int checkValidity(int a,int b,int c){
    if(a+b>c || a+c > b || b+c >a)
      return 1;
    else
      return 0;
  }
  public static void main(String args[]){
    int a=7,b=10,c=5;
    if(checkValidity(a,b,c)==1)
      System.out.println("Valid Triangle");
    else
      System.out.println("Invalid");
      
  }
}
