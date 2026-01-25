class reverseDigit {
    
    static int revDigit(int n){
        int revNum =0;
        while(n!=0){
        revNum = revNum *10+n%10;
        n=n/10;
        }
        return revNum; 
    }
    public static void main(String[] args) {
        int num =4587;
        System.out.println("Reverse number:"+revDigit(num));
    }
}