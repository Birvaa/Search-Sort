import java.util.*;
public class QuickSort {
    public static int[] swap(int x,int y){
     
        int temp = x;
        x = y;
        y = temp;
        return new int[]{x,y};
    }
    public static void quickSort(int arr[],int LB,int UB){
        boolean flag = true;
        if(LB < UB){
            int i = LB;
            int j = UB+1;
            int key = arr[LB];
            while(flag==true){
                i++;
                while(i<arr.length && arr[i] < key  ){
                    i++;
                }
                j--;
                while(j>=0 && arr[j] > key  ){
                    j--;
                }
                if(i<j){
                   int[] a = swap(arr[i],arr[j]);
                   arr[i] = a[0];
                   arr[j] = a[1];
                }
                else{
                    flag = false;
                }
            }
           int[] b = swap(arr[LB],arr[j]);
           arr[LB] = b[0];
           arr[j] = b[1];
            quickSort(arr,LB,j-1);
            quickSort(arr,j+1,UB);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n-1);
        System.out.println("Sorted array is");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
