class Q23_binarytodecimal {
    private static void binarytodecimal(int arr[]){
        // double result = Math.pow(base, exponent); 
        // int intResult = (int) result;  
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            double result = Math.pow(2, i); 
            int intResult = (int) result;  
            sum += intResult * arr[((arr.length)-1) - i];  
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0};
        binarytodecimal(arr);
    }
}