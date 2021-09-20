package ThreeDay;

import java.awt.*;
import java.awt.event.*;

public class ExampleAction {
    public static void main(String[] args) {
        Frame f = new Frame("我的窗体");
        //为窗口设置布局
        f.setLayout(new FlowLayout());
        f.setSize(300,400);
        f.setLocation(100,100);
        f.setVisible(true);
        //创建按钮对象
        Button but = new Button("Button");
        //在窗口中添加按钮组件
        f.add(but);
        but.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton()==e.BUTTON1){
                    System.out.println("mouseClicked---鼠标完成左键事件");
                }
                if (e.getButton()==e.BUTTON3){
                    System.out.println("mouseClicked---鼠标完成右键事件");
                }
                if (e.getButton()==e.BUTTON2){
                    System.out.println("mouseClicked---鼠标完成中键事件");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mousePressed---鼠标按下事件");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouseReleased---鼠标放开事件");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouseEntered---鼠标进入按钮区域事件");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouseClicked---鼠标移出按钮区域事件");
            }
        });

        ExampleMouse.WindowLister(f);
    }
}
