class sum_of_n_num {
public int printSum(int i,int n,int sum){
        int cal_sum = sum+i;
        if(i==n){
            return cal_sum;
        }
   return printSum(i+1,n,cal_sum);
    
}
    
    public static void main(String[] args) {
        Main m =new Main();
        int s=m.printSum(1,5,0);
        System.out.println(s);
    }
}
