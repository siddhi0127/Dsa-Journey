class Pattern13 {
    public static void main(String[] args) {
       int last=0;
       int n=5;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               last+=1;
               System.out.print(last+" ");
           }
           System.out.println();
       }
    }
}
