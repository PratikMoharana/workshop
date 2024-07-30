import java.util.ArrayList;

public class Q19Array {
    static boolean subarray(int arr1[], int m, int arr2[], int n){
        for(int i=0;i<=arr1.length-arr2.length;i++){
            int j;
            for(j=0;j<arr2.length;j++){
                if(arr1[i+j]!=arr2[j]){
                    break;
                }}
            if(j==arr2.length) {
                return true;
            }}
                return false;
            }


    public static void main(String[] args) {
        int arr1[]={1,3,4,6,4};
        int m=arr1.length;
        int arr2[]={4,6,4};
        int n=arr2.length;
        if(subarray(arr1,m,arr2,n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        }

}
