// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int n1=20;
       int n2=15;
       int gcd=1;

       int min=Math.min(n1,n2);
       for(int i=1;i<min;i++){
        if(n1%i==0 && n2%i==0){
            gcd=i;
        }
       }
       System.out.println("gcd : "+gcd);
    }
}
