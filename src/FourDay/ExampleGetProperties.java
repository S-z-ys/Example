package FourDay;

import java.util.Enumeration;
import java.util.Properties;

public class ExampleGetProperties {
    public static void main(String[] args) {
        //获取当前系统属性
        Properties properties = System.getProperties();
        //获得所有系统属性的key，返回Enumeration对象
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            //获取属性的key
            String key = (String) propertyNames.nextElement();
            String value = System.getProperty(key);
            System.out.println(key + "-->" + value);
        }
    }
}
