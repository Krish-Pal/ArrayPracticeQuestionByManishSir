import java.util.Arrays;
class Q21_frequencycount {
    private static void frequencycount(int arr[]) {
        arr = ascendingOrder(arr);
        for(int i = 0; i<arr.length; i++) {
            int count = 1;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            System.out.println(arr[i]+" is "+count+" times!!");
        }
        System.out.println(Arrays.toString(arr));
    }
    private static int[] ascendingOrder(int arr[]) {
        int temp;
        for(int i = 0; i< arr.length; i++) {

            for(int j = i+1; j<arr.length; j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10,50,50,20,40,40,30,20,20,40,50};            
        frequencycount(arr);
    }
}