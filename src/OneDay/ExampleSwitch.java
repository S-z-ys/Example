package OneDay;

import java.util.Scanner;

public class ExampleSwitch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        switch (s.nextInt()) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期七");
                break;
            default:
                System.out.println("输入的数字不准确");
                break;
        }
    }
}
