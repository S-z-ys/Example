package OneDay;

public class ExamplePaixu {
    public static void main(String[] args) {
        int[] arr={1,4,9,5,7,6,3};
        bubblesSort(arr);
        printArray(arr);
    }
    //定义打印数组的方法
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j);
        }
    }
    //定义数组排序的方法
    public static void bubblesSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                //比较相邻元素的大小
                if (arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
