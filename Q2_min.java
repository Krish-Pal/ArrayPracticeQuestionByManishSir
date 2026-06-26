import java.util.Arrays;

class Q2_min {
    static int minNum(int arr[]) {
        int min = arr[0];
        for(int i = 0; i< arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {12,32,540,3,65,4,534};
        int min = minNum(arr);
        System.out.println("The max number is : "+ min);
    }
}