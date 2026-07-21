class Pattern15 {
    public static void main(String[] args) {
       int n=5;
       int asci=(int)'A';
       for(int i=5;i>0;i--){
           for(int j=0;j<i;j++){
               char character=(char)(asci+j);
               System.out.print(character+" ");
           }
           System.out.println();
       }
    }
}
