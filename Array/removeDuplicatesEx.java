import java.util.*;
class removeDuplicatesEx {
    static ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        HashSet<Integer> s=new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);
                res.add(arr[i]);
            }
        }
        return res;
    }
    
    public static void main(String args[]){
        
        int arr[]={1,2,2,3,4,4,4,5,5};
        ArrayList<Integer> newsize = removeDuplicates(arr);
        
       for(int i=0;i<newsize.size();i++){
           System.out.println(newsize.get(i));
       }
        
    }
}
