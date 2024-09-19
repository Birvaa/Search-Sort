import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for(int i=0;i<n1;i++){
            System.out.println("Enter the element at index "+i);
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.print("Selection Sort: ");
        for(int i=0;i<n1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.print("Insertion Sort: ");
        for(int i=0;i<n1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.print("Bubble Sort: ");
        for(int i=0;i<n1;i++){
            System.out.print(arr[i]+" ");
        }

    }
    // Bubble Sort
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } 
    }
    // Selection Sort
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    //Insertion Sort
    public static void insertionSort(int[] arr){
        int i = 0;
        int n = arr.length;
        while( i<=n-1){
            int key = arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            i++;
        }
    }
}
