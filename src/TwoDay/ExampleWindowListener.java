package TwoDay;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExampleWindowListener {
    public static void main(String[] args) {
        //建立新窗体
        Frame f = new Frame("Java窗体");
        //设置窗体的宽，高
        f.setSize(400,400);
        //设置窗体出现的位置
        f.setLocation(300,200);
        //设置窗体可见
        f.setVisible(true);
        //为窗口组件注册监听器
        f.addWindowListener(new MyWindowListener());
    }
}
 class MyWindowListener extends WindowAdapter{
     @Override
     public void windowClosing(WindowEvent e) {
         Window w= (Window) e.getComponent();
         w.dispose();
     }
 }