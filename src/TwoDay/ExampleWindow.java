package TwoDay;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ExampleWindow {
    public static void main(String[] args) {
        Frame f = new Frame("我的窗体");
        f.setSize(300,400);
        f.setLocation(300,200);
        f.setVisible(true);
        MyWindowListeners nw = new MyWindowListeners();
        f.addWindowListener(nw);

    }
}
//创建MyWindowListener类实现WindowListener接口
class MyWindowListeners implements WindowListener {


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        Window window = e.getWindow();
        window.setVisible(false);
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
}