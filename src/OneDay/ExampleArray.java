package OneDay;


public class ExampleArray {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr={1,4,9,5,7,6,3};
        //调用获取最大元素的方法
        int max=getMax(arr);
        System.out.println("最大值："+max);
    }
    public static int getMax(int[] arr){
        //定义变量max用于记住最大的数，首先假设第一个元素最大
        int max =arr[0];
        //通过增强for循环遍历数组中的元素
        for (int j : arr) {
            //判断j的元素是否大于max
            if (j > max) {
                //条件成立将值赋予max
                max = j;
            }
        }
        return max;
    }
}
