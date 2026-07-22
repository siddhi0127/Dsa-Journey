// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Pattern17 {
    public static void main(String[] args) {
        
        int n=4;
        for(int i=1;i<=n;i++){
            //Leading Space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            
            //Letter Printing from 0 to i-1
            for(int j=0;j<i;j++){
                char ch=(char)('A'+j);
                System.out.print(ch);
            }
            //Descending order letter printing
            for(int j=i-2;j>=0;j--){
                char ch=(char)('A'+j);
                System.out.print(ch);
            }
            
            //Trailing space
            for(int j=1; j<n-i;j++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
