package OneDay;

public class ExampleStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("赵一");
        stu.setAge(12);
        stu.introduce();
        Student stu2 = new Student("zhaoyi",12);
        stu2.introduce();
    }
}
class Student {
    private String name;//将name属性私有化
    private int age;//将age属性私有化

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //对传入的参数进行检查
        if (age<=0){
            System.out.println("你输入的年龄不符合！");
        }else {
            this.age = age;
        }
    }
    public void introduce(){
        System.out.println("我的名字："+name+","+"今年"+age+"岁！");
    }
}