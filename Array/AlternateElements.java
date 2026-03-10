import java.util.*;
class AlternateElements {
    
    static ArrayList<Integer> getAlternates(int[] arr){
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=0 ; i< arr.length ; i+=2){
            res.add(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        ArrayList<Integer> bucket=getAlternates(arr);
        for(int x:bucket){
            System.out.println(x +" ");
        }
    }
}
