class multiplicationTable{
    
       void printTable(int n){
        for(int i = 1; i <= 10 ; i++){
            System.out.println(n + " * " + i + " = "+ n * i);
        }
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        m.printTable(5);
    }
}

