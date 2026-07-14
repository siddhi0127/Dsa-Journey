class Solution {
    public int secondLargestElement(int[] arr) {
    int prev=-1 , curr=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>curr){
            prev=curr;
            curr=arr[i];
        }
        else if(arr[i]>prev && arr[i]!=curr){
            prev=arr[i];
        }
    }
    return prev;
    }
}
