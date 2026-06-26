import java.util.Arrays; 

class Q6_sort2 {

    static void sort2(int arr[][]) {
        for(int i = 0;i < arr.length; i++) {
            for( int j = 0 ;j < arr[i].length; j++) {
                // System.out.print(arr[i][j]+" ");
                for(int k = 0; k<arr.length; k++) {
                    for(int l = 0;l < arr[k].length; l++) {
                        if(arr[i][j]<arr[k][l]) {
                            int temp = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = temp;
                        }
                    }
                }
            }
            // System.out.print("\n");
        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void main(String[] args) {
        int [][]arr = {
            {1,4,2},
            {7,3,6,9,10},
            {8,5,11}
        };
        sort2(arr);
    }
}