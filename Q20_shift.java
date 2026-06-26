import java.util.Arrays;
class Q20_shift {
    private static void shift(int arr[]) {
        int temp = arr[arr.length-1];
        int i;
       for(i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
       }
       arr[i] = temp;
        
    System.out.println(Arrays.toString(arr));
        
    }


    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
                    // 50, 10, 20, 30, 40
        shift(arr);
    }
}