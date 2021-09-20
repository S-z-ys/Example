package FourDay;

import java.util.Scanner;

public class ExampleParseInt {
    public static void main(String[] args) {
        Scanner w =new Scanner(System.in);
        Scanner h =new Scanner(System.in);
        int w1 = w.nextInt();
        int h1 = h.nextInt();
       /*
        int w = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        */
        for (int i = 0; i < h1; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < w1; j++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
    }
}
