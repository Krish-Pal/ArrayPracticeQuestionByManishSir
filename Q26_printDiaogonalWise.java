public class Q26_printDiaogonalWise {
    static int k = 0;
    static int s = 0;
    private static void printDiaogonalWise(int arr[]) {
       for(int i = 0; i< arr.length;i++) {
        // System.out.println("Hi 1");
        // System.out.print(arr[i]+" ");
        if((arr.length/3) > i) {
            k++;
        } else {
            k--;
        }
        for(int j = 0; j < k && k >= 0; j++) {
            // System.out.println("Hi 2");
            System.out.print(arr[s]+" ");
            s++;
        }
        System.out.println();
       } 
    } 
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        printDiaogonalWise(arr);
    }
}
