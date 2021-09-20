package OneDay;

import java.util.ArrayList;
import java.util.Scanner;

public class ExampleIf {
    public static void main(String[] args) {
        //通过输入来判断学生的成绩
        Scanner s = new Scanner(System.in);
        //通过hasNextInt()判断是否输入的是整数
        while (s.hasNextInt()) {
            int score = s.nextInt();
            //判断成绩的等级
            if (90 <= score) {
                System.out.println("优");
            } else if (80 <= score) {
                System.out.println("良");
            } else if (70 <= score) {
                System.out.println("中");
            } else if (60 <= score) {
                System.out.println("差");
            } else if (0 < score) {
                System.out.println("不及格");
            }
            if (score == 0) {
                break;
            }
        }

    }
}
