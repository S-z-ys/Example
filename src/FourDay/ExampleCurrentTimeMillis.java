package FourDay;

public class ExampleCurrentTimeMillis {
    public static void main(String[] args) {
        //循环起始时间
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;

        }
        System.out.println("sum的值："+sum);
        //循环结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行的时间："+(endTime-startTime)+"毫秒");
    }
}
