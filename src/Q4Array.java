public class Q4Array {
    public static void main(String[] args) {
        int arr[]={1,4,2,3,6};
        int n=arr.length;
        int k=3;
        for(int i=n-k,j=n-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        for(int i=0,j=n-k-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0,j=n-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i1=0;i1<n;i1++){
            System.out.println(arr[i1]+" ");
        }
    }
}
