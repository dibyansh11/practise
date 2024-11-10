import java.util.*;
public class secondSmall {

    public static void main(String[] args) {
        int arr[] = {45,32,23,45,12,43,88,90, 1};
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 0  ; i < n ; i++ ){
            if(arr[i] < small){
                secSmall  = small;
                small = arr[i];
                
            }
            else if(arr[i] < secSmall && small != arr[i]){
                secSmall = arr[i];
            }
        }
        System.out.println(secSmall);
    }
}