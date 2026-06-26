import java.util.Arrays;

class Q3_maxArray2 {
    static int maxNum(int arr[][]) {
        int max = arr[0][0];
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++) {
                if(arr[i][j]> max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
public static void main(String[] args) {
        int[][] arr = {
                    {12,32,1,540,3,65,4,534},
                    {32,4,29,90,2,843,9,89}
        };
        int max = maxNum(arr);
        System.out.println("The max number is : "+ max);
    }
}