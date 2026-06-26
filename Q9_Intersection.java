import java.util.Arrays;

class Q9_Intersection {
    static void intersection(int arr1[],int arr2[]) {
        int tempArr1[] = new int[arr1.length+arr2.length];
        int tempArr2[] = new int[arr1.length+arr2.length];
        int i = 0;
        int l = 0;
        for(i = 0; i<arr1.length; i++) {
            tempArr1[l] = arr1[i];
            l++;
        }
        for(i = 0; i<arr2.length; i++) {
            tempArr1[l] = arr2[i];
            l++;
        }
        l = 0;
        for(i = 0; i<tempArr1.length; i++) {

            for(int j = i; j<tempArr1.length-1; j++) {
                if(tempArr1[i] == tempArr1[j+1]) {
                    tempArr2[l] = tempArr1[i];
                    l++;
                }

            }
        }

        int mainArr[] = new int[l];
        for(i = 0; i<mainArr.length; i++) {
            mainArr[i] = tempArr2[i];
            l++;
        }



        System.out.println("Big Array 1 :\n"+Arrays.toString(tempArr1));
        // System.out.println("Big Array 1 :\n"+Arrays.toString(tempArr2));
        System.out.println("After Intersection :\n"+Arrays.toString(mainArr));
        // System.out.println("Length is  : "+tempArr1.length);
    }
    public static void main(String[] args) {
        int arr1[] = {3, 4, 3, 6, 5, 6, 8};
        int arr2[] = {1, 4, 9, 10, 8};
            
        System.out.println("Before sorting");
        for(int n : arr1) {
            System.out.print(n+" ");
        }
        System.out.println();
        for(int n : arr2) {
            System.out.print(n+" ");
        }
        System.out.println();
        intersection(arr1,arr2);

        // mergeSort(arr, 0, arr.length-1);
    } 
}
