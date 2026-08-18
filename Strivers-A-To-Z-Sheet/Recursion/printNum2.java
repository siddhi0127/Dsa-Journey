// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class solution{
        public void printNum(int i,int n){
            if(n<i){
                return;
            }
            System.out.println(n);
            printNum(i,n-1);
        }
}
class Main {
    public static void main(String[] args) {
       solution s= new solution();
       int n=10;
       int i=1;
       s.printNum(i,n);
    }
}
