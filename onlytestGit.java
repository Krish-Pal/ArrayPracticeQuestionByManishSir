import java.util.Arrays;

class Q1_maxArray {

    static int maxNum(int arr[]) {
        int max = arr[0];

        for(int i = 0; i< arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {12,32,540,3,65,4,534};

        int max = maxNum(arr);
        System.out.println("The max number is : "+ max);
    }
}