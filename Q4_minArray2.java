import java.util.Arrays;

class Q3_minArray2 {
    static int minNum(int arr[][]) {
        int min = arr[0][0];
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++) {
                if(arr[i][j]< min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
public static void main(String[] args) {
        int[][] arr = {
                    {12,32,1,540,3,65,4,534},
                    {32,4,29,90,2,843,9,89}
        };
        int min = minNum(arr);
        System.out.println("The min number is : "+ min);
    }
}