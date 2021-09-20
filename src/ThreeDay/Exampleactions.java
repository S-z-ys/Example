package ThreeDay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


 public class Exampleactions {
    public static void main(String[] args){
        WindowActionEvent win= new WindowActionEvent();
        win.setTitle("处理ActionEvent事件");
        win.setBounds(100,100,310,260);
    }

}


class WindowActionEvent extends JFrame {
    JTextField text;
    ActionListener listener;
    JButton a1,a2,a3,a4;
    public WindowActionEvent(){
        setLayout(new BorderLayout());
        text = new JTextField("JAVA的事件响应",10);
        a1=new JButton("我是北按键");
        a2=new JButton("我是西按键..");
        a3=new JButton("我是南按键...");
        a4=new JButton("我是东按键.");
        add(text,BorderLayout.CENTER);
        add(a1,BorderLayout.NORTH);
        add(a2,BorderLayout.WEST);
        add(a3,BorderLayout.SOUTH);
        add(a4,BorderLayout.EAST);
        listener= new ReaderListen();
        text.addActionListener(listener);
        a1.addActionListener(listener);
        a2.addActionListener(listener);
        a3.addActionListener(listener);
        a4.addActionListener(listener);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

 class ReaderListen implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        System.out.println(str + ":" + str.length());
    }
}