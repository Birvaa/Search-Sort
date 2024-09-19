public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                
                for ( int j = i-gap; j >= 0 ; j -= gap) {
                    if(arr[j+gap]>arr[j]){
                        break;
                    }
                    else{
                        int temp = arr[j+gap];
                        arr[j+gap] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        shellSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
