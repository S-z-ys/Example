package OneDay;

public class ExampleMethod01 {
    public static void main(String[] args) {
        printRectangle(10,10);
    }
    //定义一个打印矩形的方法，接受俩个参数，height为高，width为宽
    public static void printRectangle(int height,int width){
        //嵌套for循环
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
        //换行
        System.out.println();
    }
}
