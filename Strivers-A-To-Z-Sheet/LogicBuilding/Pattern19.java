 class Pattern19{
    public static void main(String args[]){
        int n=5;
        int count=0;
        for(int i=n ; i>=1 ; i--){
            for(int j=1 ; j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=count;j++){
                System.out.print(" ");
               
            }
           
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
             count=count+2;
        }
        
    }
 }
