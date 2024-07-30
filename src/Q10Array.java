import java.util.Arrays;

public class Q10Array {
    public static void main(String[] args) {
        int arr[]={1,4,-2,4,6,-13};
        Arrays.sort(arr);
        int p1=arr[0]*arr[1];
        int p2=arr[arr.length-1]*arr[arr.length-2];
        if(p1<p2){
            p1=arr[arr.length-1];
            p2=arr[arr.length-2];
        }
        else{
            p1=arr[0];
            p2=arr[1];
        }
        System.out.println(p1 +" " + p2);
    }
}
