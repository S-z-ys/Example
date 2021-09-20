package ThreeDay;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class ExampleKey {
    public static void main(String[] args) {
        Frame f = new Frame("我的窗体");
        //为窗口设置布局
        f.setLayout(new FlowLayout());
        f.setSize(300,400);
        f.setLocation(300,300);

        //创建文本框对象
        TextField tf = new TextField(30);
        //在窗口中添加文本框组件
        f.add(tf);
        f.setVisible(true);
        //为文本框添加键盘事件监听器
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //返回所按键对应的整数值
                int KeyCode = e.getKeyCode();
                //返回按键的字符串描述
                String s = KeyEvent.getKeyText(KeyCode);
                System.out.println("输入的内容："+s+",");
                System.out.println("对应的KeyCode为："+KeyCode);
            }
        });
        ExampleMouse.WindowLister(f);
    }
}
