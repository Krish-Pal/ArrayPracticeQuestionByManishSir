import java.util.Arrays;
class Q22_firstnonrepeatingelement {
    private static void frequencycount(int arr[]) {
        // arr = ascendingOrder(arr);
        for(int i = 0; i<arr.length; i++) {
            int count = 1;
            for(int j = 0; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                } 
            }
            if(count == 2) {
                System.out.println("First non repeating number is "+arr[i]);
                break;
            }
            // System.out.println(arr[i]+" is "+count+" times!!");
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
        int arr[] = {10,99,80,50,50,30,99,20,40,30,40,10,00,80,20,40,50};            
        frequencycount(arr);
    }
}