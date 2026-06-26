class Q19_triangleBmin {

    private static void triangleBmin(int [][]arr){
        // System.out.println("working!!");

        int min = arr[0][0];
        for(int i = 0; i<arr.length; i++) {

            for(int j = 0;j<=i; j++) {
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("The min is "+min);
    }
    public static void main(String[] args) {
        int[][] arr = {
                    {1,-21,3},
                    {14,5,6},
                    {7,8,-9}        
        };
    triangleBmin(arr);
    }
}