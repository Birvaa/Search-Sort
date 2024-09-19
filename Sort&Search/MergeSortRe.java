import java.util.*;
public class MergeSortRe {
    public static void mergeSort(int arr[],int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int arr[],int low,int mid,int high){
        int merged[]= new int[high+1];
        int i=low;
        int h=low;
        int j = mid+1;
        while(h<=mid && j<=high){
            if(arr[h]<= arr[j]){
                merged[i]=arr[h];
                h++;
            }else{
                merged[i]=arr[j];
                j++;
            }
            i++;
        }
        if(h>mid){
            for(int k=j; j<=high; j++){
                merged[i]=arr[k];
                i++;}
        }else{
            for(int k=h; h<=mid; h++){
                merged[i]=arr[k];
                i++;
            }
        }
        for(int k=low; k<=high; k++){
            arr[k]=merged[k];
        }
        }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0 , n-1);
        System.out.println("Sorted array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
