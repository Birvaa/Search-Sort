import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Sort s1 = new Sort();

        s1.mSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class Sort{
    public void mSort(int[] arr,int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;

        mSort(arr,low,mid);
        mSort(arr,mid+1,high);
        sortEle(arr,low,mid,high);
    }

    public void sortEle(int[] arr,int low,int mid,int high){
        ArrayList<Integer> ans = new ArrayList<>();
        int l = low;
        int r = mid+1;
        while(l <= mid && r <= high){
            if(arr[l] <= arr[r]){
                ans.add(arr[l]);
                l++;
            }else{
                ans.add(arr[r]);
                r++;
            }
        }
        while(l <= mid){
            ans.add(arr[l]);
            l++;
        }
        while(r <= high){
            ans.add(arr[r]);
            r++;
        }
        
        for (int i = 0; i < ans.size(); i++) {
            arr[low+i] = ans.get(i);
        }

    }

}
