class Q24_maxinonrow {
    private static void maxinonRow(int arr[][]) {
        int max = arr[0][0];
        for(int i = 0; i< arr.length;i++) {
            for(int j = 0; j<arr[i].length; j++) {
                // System.out.print(arr[i][j]+" ");
                for(int k =0; k<arr[i].length; k++) {
                    if(max<arr[i][k]) {
                        max = arr[i][k];
                    }
                }
            }
            System.out.println(max+" max number is arr "+ (i+1));
            // System.out.println();
        }
            // System.out.println(Arrays.deepToString(arr));
    }
    public static void main(String[] args) {
        int[][] arr = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},        
                    {7,63,9},        
                    {19,8,9},        
                    {7,500,9},        
        };
        maxinonRow(arr);
    }
}
