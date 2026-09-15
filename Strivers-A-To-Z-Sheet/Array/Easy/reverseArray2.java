class Main 
{
    public void swap(int arr[],int p1,int p2)
    {
        int temp=arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;
    }
    
    public void reverseArray(int arr[]){
        int p1=0;
        int p2=arr.length-1;

        while(p1<p2){
            swap(arr,p1,p2);
            p1++;
            p2--;
        }
        
    }
    public static void main(String[] args) 
    {
       int arr[]={5,4,3,2,1};
       Main m=new Main();
        m.reverseArray(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
