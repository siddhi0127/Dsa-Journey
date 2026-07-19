class pattern7 {
    public static void main(String[] args) {
        int n=5;
        //row
        for(int row=1;row<=n;row++){
            //space
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            //star
            for(int star=1; star<=row*2-1 ;star++){
                System.out.print("*");
            }
            
            //space
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
