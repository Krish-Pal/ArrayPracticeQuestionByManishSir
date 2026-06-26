import java.util.Arrays;

class Q4_sort {
    static void sort(int arr[]) {
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j< arr.length; j++) {
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array is : "+Arrays.toString(arr));
    }
public static void main(String[] args) {
        int[] arr = {12,32,1,1,540,3,65,4,534};
        sort(arr);
    }
}