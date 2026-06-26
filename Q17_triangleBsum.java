class Q17_triangleBsum {

    private static void triangleBsum(int [][]arr){
        // System.out.println("working!!");

        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0;j<=i; j++) {
                sum+=arr[i][j];
            }
            System.out.println("The sum is "+sum);
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}        
        };
    triangleBsum(arr);
    }
}