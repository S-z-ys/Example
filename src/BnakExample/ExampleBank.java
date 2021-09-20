package BnakExample;

import java.util.Scanner;

public class ExampleBank {
    int account;
    private static User user;

    public static void main(String[] args) {
        ExampleBank b = new ExampleBank();
        b.login();
        b.operate();
    }

    /**
     * 账户金额存入、取出和查询操作
     */
    public void operate() {
        ExampleBank b = new ExampleBank();
        while (true) {
            System.out.println("请输入您要进行的操作类型，按回车键结束");
            System.out.println("1,存款" + "\t" + "2,取款"+ "\t"+"3,余额" + "\t" + "0,退出");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine(); // 输入的操作类型
            if("1".equals(s) || "2".equals(s)){
                int num ;
                try{
                    System.out.print("输入存取的金额：");
                    num = Integer.parseInt(in.nextLine());
                }catch(Exception e){
                    System.out.println("金额输入错误！");
                    continue;
                }
                switch (s) {
                    case "1": // 存款操作
                        b.income(num);
                        break;
                    case "2": // 取款操作
                        b.takeout(num);
                        break;
                }
            }else if("3".equals(s)){
                b.show();
            }else if("0".equals(s)){
                System.out.println("退出系统！");
                return;
            }else{
                System.out.println("请输入0~3之间的数字选择相关操作！");
            }
        }
    }

    /**
     * 用户登录网上银行
     */
    public void login() {
        DBUtil dbutil = DBUtil.getInstance();
        System.out.println("欢迎进入网上银行系统！");
        while (true) {
            Scanner in = new Scanner(System.in); // 键盘录入
            System.out.println("请输入银行卡号：");
            String cardId = in.nextLine();
            System.out.println("请输入银行卡密码：");
            String cardPwd = in.nextLine();
            user = dbutil.getUser(cardId);
            // 登录
            if (dbutil.getUsers().containsKey(cardId)
                    && String.valueOf(user.getCardPwd()).equals(cardPwd)) {
                System.out.println("登录成功！欢迎" + user.getUserName() + "先生");
                break;
            } else {
                System.out.println("银行卡号或密码错误！");
            }
        }
    }

    /**
     * 存款
     *
     * @param num
     */
    public void income(int num) {
        account = user.getAccount() + num;
        user.setAccount(account);
        System.out.println("存入金额" + num + "元成功！");
    }

    /**
     * 取款
     *
     * @param num
     */
    public void takeout(int num) {
        if(user.getAccount() >= num){
            account = user.getAccount() - num;
            user.setAccount(account);
            System.out.println("取出金额" + num + "元成功！");
        }else{
            System.out.println("余额不足，取款失败！");
        }
    }

    /**
     * 查询余额
     */
    public void show() {
        account = user.getAccount();
        System.out.println("账户总余额为" + account + "元");
    }
}
