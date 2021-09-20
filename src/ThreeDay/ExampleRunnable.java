package ThreeDay;

public class ExampleRunnable {
    public static void main(String[] args) {
        MyThreads mt = new MyThreads();
        Thread th = new Thread(mt);
        th.start();
        while(true){
            System.out.println("main方法在运行" );
        }
    }
}
class MyThreads implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("MyThreads类的run()方法在运行");
        }
    }
}