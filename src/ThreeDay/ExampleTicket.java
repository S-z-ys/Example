package ThreeDay;

public class ExampleTicket {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        new Thread(t,"窗口1").start();
        new Thread(t,"窗口2").start();
        new Thread(t,"窗口3").start();
        new Thread(t,"窗口4").start();
    }
}
class Ticket implements Runnable{
    private int tickets=100;
    @Override
    public void run() {
        while (true){
            if (tickets>0){
                Thread th = Thread.currentThread();
                String th_name= th.getName();
                System.out.println(th_name+"正在出售第"+(tickets--)+"票");
            }
        }
    }
}