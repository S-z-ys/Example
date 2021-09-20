package TwoDay;
/*
打印1~99的奇数和
 */
public class ExampleSum {
    public static void main(String[] args) {
        //定义一个sum用于接受累加数和
        int sum=0;
        //定义for循坏打印1~99数
        for (int i = 0; i < 100; i++) {
            //判断是否为偶数
            if (i % 2 == 1) {
                sum+=i;//累加和
                System.out.println(sum);
            }
        }
    }
}
