class leadersInArray {
    static ArrayList<Integer> leaders(int arr[]){
        
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        
        for(int i=0;i< n ;i++){
            
            int j;
            
            for(j=i+1 ;j<n;j++){
                
                if(arr[i] < arr[j])
                    break;
            }
                
            if(j == n)
                res.add(arr[i]);
                
            
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={16,17,4,3,5,2};
        ArrayList<Integer> res = leaders(arr);
        
        for(int ele : res){
            System.out.println(ele + " ");
        }
        System.out.println();
        
    }
}
