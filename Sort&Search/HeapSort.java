import java.util.Scanner;

public class HeapSort {
    public static void heapify(int[] arr, int n,int i){
        int maxindex = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && arr[left]>arr[maxindex]){
            maxindex = left;
        }
        if(right<n && arr[right]>arr[maxindex]){
            maxindex = right;
        }
        if(maxindex!=i){
            int temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
            heapify(arr,n,maxindex);
        }
    }
    public static void maxheap(int[] arr){
        for(int i = arr.length/2-1;i>=0;i--){
            heapify(arr,arr.length,i);
        }
        
    }
    public static void heapSort(int[] arr){
        maxheap(arr);
        for(int i = arr.length-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        heapSort(arr);
        System.out.println("Sorted array is");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
