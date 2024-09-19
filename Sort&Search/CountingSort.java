import java.util.*;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int n = arr.length;
        int max = getMax(arr);
        int b[] = new int[n];
        int c[] = new int[max + 1];
        
        for(int i = 0; i<n; i++){
            c[arr[i]]++;
        }

        for(int i = 1; i<=max; i++){
            c[i] += c[i-1];
        }


        for(int i = n-1; i>=0; i--){
            b[c[arr[i]]-1] = arr[i];
            c[arr[i]]--;
        }
        System.out.println(Arrays.toString(b));   

    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2,3,1,6};
        countingSort(arr);
    }
}
