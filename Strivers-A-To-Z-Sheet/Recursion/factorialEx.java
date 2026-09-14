class factorialEx {
    public void printFact(int i,int n,int fact){
        int ffact =fact*i;
        if(i==n){
            System.out.println(ffact);
            return ;
        }
        printFact(i+1,n,ffact);
    }
    public static void main(String[] args) {
       Main m=new Main();
        m.printFact(1,5,1);
        
    }
}
