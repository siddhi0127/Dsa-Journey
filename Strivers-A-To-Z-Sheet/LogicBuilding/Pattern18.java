 class Pattern18{
    public static void main(String args[]){
        int n=4;
        for(int i=n;i>=0;i--){
            for(int j=0 ; j<=n-i ; j++){
                char ch=(char)(j+'A'+i);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

}
