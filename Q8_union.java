import java.util.Arrays;
class Q8_union {

    static void union(int arr1[],int arr2[]) {
       
        int[] tempArr = new int[arr1.length+arr2.length];
        // System.out.println("Length --> "+tempArr.length);
        int i = 0;
        int temp = 0;
        int l = 0;
        boolean flag = false;
        for(i = 0; i<arr1.length; i++) {
            temp = arr1[i];
            if(temp == 0 && flag == false) {
                flag = true;
            }
            int j = l;
            while(j>-1) {
                if(temp == tempArr[j])
                    break;
                if(j == 0) {
                    tempArr[l] = temp;
                    l++;
                    break;
                }
                j--;
            }
        }
        for(i = 0; i<arr2.length; i++) {
            temp = arr2[i];
            if(temp == 0 && flag == false) {
                flag = true;
            }
            int j = l;
            while(j>-1) {
                if(temp == tempArr[j])
                    break;
                if(j == 0) {
                    tempArr[l] = temp;
                    l++;
                    break;
                }
                j--;
            }
        }
        // // if(flag != false) {
        //     int[] MainArr = new int[l+1];
        //     for(i = 0;i < MainArr.length; i++) {
        //         MainArr[i] = tempArr[i];
        //     }
        //     MainArr[l+1] = 0;
        // } else {
            int[] MainArr = new int[l+1];
            for(i = 0;i < MainArr.length; i++) {
                MainArr[i] = tempArr[i];
            }
        // }
        

        
        // System.out.println("value of l is "+ l);

        System.out.println("Union Applied :\n"+Arrays.toString(MainArr));

    }
    public static void main(String[] args) {
        int arr1[] = {3, 0, 4, 3, 6, 5, 6, 8};
        int arr2[] = {1, 0, 4, 9, 10};
            
        System.out.println("Before sorting");
        for(int n : arr1) {
            System.out.print(n+" ");
        }
        System.out.println();
        for(int n : arr2) {
            System.out.print(n+" ");
        }
        System.out.println();
        union(arr1,arr2);

        // mergeSort(arr, 0, arr.length-1);
    }
    
}
