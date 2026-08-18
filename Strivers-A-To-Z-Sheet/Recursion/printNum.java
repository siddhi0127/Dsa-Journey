// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class solution{
        public void printNum(int i,int n){
            if(i>n){
                return;
            }
            System.out.println(i);
            printNum(i+1,n);
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
