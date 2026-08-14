
class countDigit {
    public static void main(String[] args) {
  
        int n=123;
        int counter=0;
        while(n>0){
            int rem=n%10;
            counter++;
            n=n/10;
        }
        System.out.println(counter);
    }
}
