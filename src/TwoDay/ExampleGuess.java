package TwoDay;

import java.util.Random;
import java.util.Scanner;

/*
1.首先我们要借助Java API提供的Random类来产生一个1到1000的随机整数，
并提示用户输入一个1-1000随机整数。
2.然后定义一个int count = 10，
编写while (--count >= 0) {}方法用来表示程序最多可猜测10次。
循环体内通过System.in从控制台输入，并通过nextLine()方法读取下一行，
等待用户输入一个文本行并且回车。
3.接下来通过if语句将输入数与随机数进行比较，若输入的数字比产生的数字小，
则输出：“太小了，再大一点！”；若输入的数字比产生的数字大，则输出：“太大了，再小一点！”，
若输入的数字和产生的数字相等，则输出：“恭喜你猜对了！”并通过break语句跳出循环，游戏结束。
4.最后为了防止用户输入的不是数字，需要将输入的数字转换为整数，
并通过try{}catch(){}语句对判断方法进行异常控制，
如果输入的不是数字，则系统会输出“输入有误，请输入数字！”。
当系统循环10次以后，仍然没有猜中，则控制台会输出“你太笨了，下次再来吧！”。

 */
public class ExampleGuess {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        //创建Random类的对象
        Random r = new Random();
        //定义随机数的范围
        int num = r.nextInt(1001);
        //定义输入的次数
        int count = 10;
        //通过try...catch抓住异常
        try{
            while (--count>=0){
                //创建Scanner类对象
                Scanner sc = new Scanner(System.in);
                //将输入信息的下一个标记扫描为一个 int
                int scs=sc.nextInt();
                System.out.println(sc.nextLine());
                //判断输入的次数，
                if(count == 0) {
                    System.out.println("你太笨了，下次再来吧！");
                }else if (scs<num){
                    System.out.println("数字太小了，再大一点！");
                }else if (scs==num){
                    System.out.println("恭喜你猜对了！");
                    break;
                }else {
                    System.out.println("数字太大了，再小一点！");
                }

            }

        }catch (Exception e){
            System.out.println("输入有误，请输入数字！");
        }

    }
}
