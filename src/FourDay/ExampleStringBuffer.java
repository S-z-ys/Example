package FourDay;



public class ExampleStringBuffer {
    public static void main(String[] args) {
        System.out.println("1,添加--------------");
        add();
        System.out.println("2,删除--------------");
        remove();
        System.out.println("3,修改--------------");
        alter();
    }
    private static void add() {
        //定义一个字符串缓冲区
        StringBuffer sb = new StringBuffer();
        //在末尾添加字符串
        sb.append("abcdefg");
        System.out.println("append添加结果："+sb);
        //在指定位置插入字符串
        sb.insert(2,"123");
        System.out.println("insert添加结果："+sb);
    }
    private static void remove() {
        StringBuffer sb = new StringBuffer("abcdefg");
        //指定范围删除
        sb.delete(1,5);
        System.out.println("删除指定范围的结果："+sb);
        //指定位置删除
        sb.deleteCharAt(2);
        System.out.println("删除指定位置的结果："+sb);
        //清空缓冲区
        sb.delete(0,sb.length());
        System.out.println("清空缓冲区结果："+sb);
    }
    private static void alter() {
        StringBuffer sb = new StringBuffer("abcdefg");
        //修改指定位置字符
        sb.setCharAt(1,'p');
        System.out.println("修改指定位置字符结果："+sb);
        //替换指定位置字符串或字符
        sb.replace(1,3,"qq");
        System.out.println("替换指定位置字符结果："+sb);
        System.out.println("字符串翻转结果："+sb.reverse());
    }
}
