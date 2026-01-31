public class lcmUsingGcd{
static int gcd(int a, int b){
while(b!=0){
int rem =a%b;
a=b;
b=rem;
}
return a; 
}
static int lcm(int a, int b){
return ((a/gcd(a,b))*b);
}

public static void main(String args[]){
int a=10,b=7;
System.out.println(lcm(a,b));
}
}