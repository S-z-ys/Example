package ThreeDay;

public class ExampleThread {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        while (true){
            System.out.println("main方法在运行" );
        }
    }
}
class  MyThread extends Thread{
    public void run(){
        while(true){
            System.out.println("MyThread类的run()方法在运行");
        }
    }
}