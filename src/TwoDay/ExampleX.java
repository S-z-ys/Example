package TwoDay;


public class ExampleX {
    public static void main(String[] args) {
          perice(-1);
    }

    public static int perice(int x) {
        int y;
        if (x>0){
           y= x+3;
            System.out.println(y);
        }else if(x==0){
            y=0;
            System.out.println(y);
        }else{
            y=x*x-1;
            System.out.println(y);
        }
        return y;
    }
}
