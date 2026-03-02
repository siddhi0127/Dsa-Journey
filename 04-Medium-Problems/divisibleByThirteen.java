public class divisibleByThirteen{
  static boolean divide(String s){
    int num=Integer.parseInt(s);
    return num%13==0;
  }
  public static void main(String args[]){
    String s="1233";
    if(divide(s))
    {
      System.out.println("Divisible by 13");
    }
    else
    {
      System.out.println("Cant divide by 13");
    }
  }
}
