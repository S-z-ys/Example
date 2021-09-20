package TwoDay;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExampleButton {
    public static void main(String[] args) {
        //建立新窗体
        Frame f = new Frame("Java窗体");
        //设置窗体的宽，高
        f.setSize(400,400);
        //设置窗体出现的位置
        f.setLocation(300,200);
        //设置窗体可见
        f.setVisible(true);
        Button btn = new Button("EXIT");
        f.add(btn);
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }
}
