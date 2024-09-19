import java.util.Arrays;

public class RedixSort {

    public static void main(String[] args) {
        int arr[] = {170,45,75,90,802,24,2,66};
        radixsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixsort(int arr[]){
        int max = getMax(arr);
        for(int exp = 1; max/exp > 0; exp *= 10){
            countSort(arr,exp);
        }
    }
    
    public static int getMax(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void countSort(int arr[], int exp){
        int output[] = new int[arr.length];
        int count[] = new int[10];
        for(int i=0;i<10;i++){
            count[i] = 0;
        }
        for(int i = 0; i < arr.length; i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i = 1; i < 10; i++){
            count[i] += count[i-1];
        }
        for(int i = arr.length-1;i>=0;i--){
            count[(arr[i]/exp)%10]--;
            output[count[(arr[i]/exp)%10]] = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = output[i];
        }
    }
    
    
}
