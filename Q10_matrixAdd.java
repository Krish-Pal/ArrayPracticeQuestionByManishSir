import java.util.Arrays;

class Q10_matrixAdd {
    static void matAdd(int arr1[][],int arr2[][]) {

        for(int i = 0; i< arr1.length; i++) {
            for(int j = 0; j<arr1.length; j++) {
                int sum = arr1[i][j]+arr2[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
        int[][] arr1 = {
                    {1,1,1},
                    {1,3,1},
                    {1,1,1}        
        };
        int[][] arr2 = {
                    {1,1,1},
                    {1,3,1},
                    {1,1,1}        
        };
        matAdd(arr1,arr2);
        
    }
}