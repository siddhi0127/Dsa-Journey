class arraySorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        boolean isTrue=true;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isTrue=false;
                break;
            }
            
        }
        System.out.println("is Array sorted ?"+isTrue);
        
    }
}
