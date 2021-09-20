package ThreeDay;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ExampleMouse {
    public static void main(String[] args) {
        final Frame f = new Frame("我的窗体");
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
                if (e.getButton()== MouseEvent.BUTTON1){
                System.out.println("mouseClicked---鼠标完成左键事件");
                }
                if (e.getButton()== MouseEvent.BUTTON3){
                    System.out.println("mouseClicked---鼠标完成右键事件");
                }
                if (e.getButton()== MouseEvent.BUTTON2){
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

        WindowLister(f);
    }

    public static void WindowLister(Frame f) {
        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing---窗体正在关闭事件");
                Window window = e.getWindow();
                window.setVisible(false);
                window.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}
