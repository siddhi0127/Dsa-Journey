class Main 
{
    public int[] reverseArray(int arr[],int n){
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
        ans[i]=arr[n-1-i];
        }
    return ans;
    }
    public static void main(String[] args) 
    {
        int arr[]={3333333,444,5555};
        int n=arr.length;
        Main m =new Main();
        int res[]=m.reverseArray(arr,n);
       
        for(int num:res){
            System.out.print(num +" ");
        }
        System.out.println();
    }
}
