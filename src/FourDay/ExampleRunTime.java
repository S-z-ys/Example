package FourDay;

public class ExampleRunTime {
    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime();
        Process process = rt.exec("notepad.exe");
        Thread.sleep(3000);
        process.destroy();
        /*
        System.out.println("处理器的个数："+rt.availableProcessors());
        System.out.println("空闲内存数量："+rt.freeMemory()/1024/1024+"M");
        System.out.println("最大可用内存："+rt.maxMemory()/1024/1024+"M");
        */

    }
}
