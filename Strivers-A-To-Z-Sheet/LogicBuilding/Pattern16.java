// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Pattern16 {
    public static void main(String[] args) {
        int n=5;
        int ascii=(int)'A';
        int count=0;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char ch=(char)(ascii+count);
                System.out.print(ch+" ");
            }
            System.out.println();
            count++;
        }
    }
}
