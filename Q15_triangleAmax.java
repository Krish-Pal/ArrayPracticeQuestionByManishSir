class Q15_triangleAmax {

    private static void triangleAmax(int [][]arr){
        // System.out.println("working!!");

        int max = arr[0][0];
        for(int i = 0; i<arr.length; i++) {

            for(int j = i;j<arr[i].length; j++) {
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The max is "+max);
    }
    public static void main(String[] args) {
        int[][] arr = {
                    {1,21,3},
                    {4,5,6},
                    {7,8,9}        
        };
    triangleAmax(arr);
    }
}