import java.util.*;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[];
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        int ans = linearSearch(a, x);
        int ans1 = binarySearch(a, x);
        int index = binarySearch(a, x);
       
        if(ans==-1||index==-1||ans1==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("The element is found at index using linear search : " + ans);
            System.out.println("The element is found at index using binary search : " + index);
            System.out.println("The element is found at index using binary search recurstion : " + ans1);
        }

    }
    public static int linearSearch(int a[], int x) {
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int a[], int x){
        int l=0;
        int r = a.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static int r_binarySearch(int a[], int x,int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]<x){
                return r_binarySearch(a,x,mid+1,r);
            }
            else{
                return r_binarySearch(a,x,l,mid-1);
            }
        }
        else{
            return -1;
        }
    }
}