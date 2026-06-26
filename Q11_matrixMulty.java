import java.util.Arrays;

class Q11_matrixMulty {
    static void matrixMulty(int arr1[][],int arr2[][]) {
        for(int i = 0; i< arr1.length; i++) {
            for(int j = 0; j<arr2.length; j++) {
                int sum = 0;
                for(int k = 0; k< 3; k++) {
                    // sum += arr1[i][j+k]*arr2[j+k][i];
                    // System.out.println(k);
                    System.out.print(i+(j+k)+" ");
                }
                // have to work on it
                // have to work on it
                // have to work on it
                // have to work on it
                // have to work on it
                // have to work on it
                // have to work on it
                System.out.println();
                // System.out.print(sum+" ");
                // System.out.print(i+""+j+" ");
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
        matrixMulty(arr1,arr2);
        
    }
}