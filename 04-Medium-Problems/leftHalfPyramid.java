public class leftHalfPyramid{
    public static void main(String args[]){
        int n=5;
        //row
        for(int row=1;row<=n;row++){
            //star
            for(int star=1;star<=n-row;star++){
                System.out.print("*");
            }
            //space
            for(int space=1;space<=row;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}