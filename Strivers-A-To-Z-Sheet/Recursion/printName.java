class solution{
    public void printName(String name,int counter,int N){
        if(counter==N){
        return;
        }
        System.out.println(name);
        printName(name,counter+1,N);
    }
}
class Main {

    public static void main(String[] args) {
        solution s = new solution();
        int N=5;
        int counter=0;
        String name="SIDDHI";

        s.printName(name,counter,N);
    }
}
