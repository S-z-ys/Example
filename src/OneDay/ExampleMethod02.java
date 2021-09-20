package OneDay;
//方法的重载：方法名相同，参数个数不或者参数类型不同
public class ExampleMethod02 {
    public static void main(String[] args) {
        int sum1=addSum(2,3);
        System.out.println("sum1:"+sum1);
        double sum2=addSum(2.1,2.4);
        System.out.println("sum2:"+sum2);
        int sum3=addSum(1,2,3);
        System.out.println("sum3:"+sum3);
    }
    public static int addSum(int x,int y){
        return x+y;
    }
    public static double addSum(double x,double y){
        return x+y;
    }
    public static int addSum(int x,int y,int z){
        return x+y+z;
    }

}
