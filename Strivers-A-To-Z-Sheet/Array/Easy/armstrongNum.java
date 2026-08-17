// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int num=1634;
        int org=num;
        int counter=0;
        int sum=0;
        while(num>0){
            int rem=num%10;
            counter ++;
             num=num/10;
        }
        System.out.println("Digit count :"+counter); 
        num=org;
        while(num>0){
            int rem2=num%10;
            double res=Math.pow(rem2,counter);
            sum+=res;
            num=num/10;
        }
        System.out.println("Sum : "+sum);

        if(sum==org){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
        
    }
}
