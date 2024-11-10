/**
 * mergeSort
 */
public class mergeSort {
    static void merge(int arr[] , int s , int e){
        
    }
    static void divide(int arr[] , int s , int e){
        if(s >= e){
            return;
        }
        
        int mid = (s+e)/2;
        divide(arr , s , mid);
        divide(arr , mid+1 , e);
        merge(arr , s , e);


    }
    public static void main(String[] args) {
        

        int arr[] = {34 , 54, 56,32,22,6,3,98};
        int  len = arr.length;
        // System.out.println(len);
    }
}