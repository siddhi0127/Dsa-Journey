class Pattern22 {
    public static void main(String[] args) {
        int n=7;
        int center=n/2+1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int minDist=Math.min(
                Math.min(i,n-1-i),
                Math.min(j,n-1-j)
                );
                int value=center-minDist;
                System.out.print(value+" ");
            }
            System.out.println();
        }
       
    }
}
