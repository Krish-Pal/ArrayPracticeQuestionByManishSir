class Q16_triangleAmin {

    private static void triangleAmin(int [][]arr){
        // System.out.println("working!!");

        int min = arr[0][0];
        for(int i = 0; i<arr.length; i++) {

            for(int j = i;j<arr[i].length; j++) {
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("The min is "+min);
    }
    public static void main(String[] args) {
        int[][] arr = {
                    {1,21,3},
                    {4,5,6},
                    {-17,8,-9}        
        };
    triangleAmin(arr);
    }
}