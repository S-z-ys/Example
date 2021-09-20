package FourDay;

public class ExampleArraycopy {
    public static void main(String[] args) {
        //源数组
        int[] arr1 = {1, 2, 3, 4};
        //目标数组
        int[] arr2 = {5, 6, 7, 8, 9};
        for (int j = 0; j < arr2.length; j++) {
            if (j < arr2.length - 1) {
                System.out.print(arr2[j] + ",");
            } else {
                System.out.println(arr2[j]);
            }
        }
        System.arraycopy(arr1, 1, arr2, 2, 2);

        for (int i = 0; i < arr2.length; i++) {
            if (i < arr2.length - 1) {
                System.out.print(arr2[i] + ",");
            } else {
                System.out.println(arr2[i]);
            }
        }
    }
}
