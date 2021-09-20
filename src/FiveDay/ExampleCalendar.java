package FiveDay;

import java.util.Calendar;



public class ExampleCalendar {
    public static void main(String[] args) {
        //获取表示当前时间的Calendar对象
        Calendar c = Calendar.getInstance();
        /*
        int year = c.get(Calendar.YEAR);//获取当前年份
        int month = c.get(Calendar.MONTH) + 1;//获取当前月份
        int date = c.get(Calendar.DATE);//获取当前日
        int hour = c.get(Calendar.HOUR);//获取时
        int minute = c.get(Calendar.MINUTE);//获取分
        int second = c.get(Calendar.SECOND);//获取秒
        System.out.println("当前时间为：" + year + "年" + month + "月"
                + date + "日" + hour + "时" + minute + "分" + second + "秒");
                */
        //设定日期
        c.set(2018, 12,1);
        c.add(Calendar.DATE,100);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"-"+month+"-"+date);
    }
}
