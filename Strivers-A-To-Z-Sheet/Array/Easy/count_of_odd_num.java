class count_of_odd_num {
    public static void main(String[] args) {
        int arr[]={1,-1,2,1,-1,1};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
            
        }
        System.out.println("Count : "+count);
        
    }
}
