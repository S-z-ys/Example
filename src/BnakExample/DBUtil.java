package BnakExample;

import java.util.HashMap;

public class DBUtil {
    private static DBUtil instance = null;
    private final HashMap<String, User> users = new HashMap<>();
    private DBUtil(){
        User u1 = new User("1002","123456","赵一","123456789",1000);
        users.put(u1.getCardId(),u1);users.put(u1.getCardId(),u1);

        User u2 = new User();
        u2.setCardId("1001");
        u2.setCardPwd("123456");
        u2.setUserName("赵er");
        u2.setCall("1245678397");
        u2.setAccount(1000);
        users.put(u2.getCardId(),u2);
    }

    public static  DBUtil getInstance(){
        if (instance==null){
            synchronized (DBUtil.class){
                if(instance==null){
                    instance = new DBUtil();
                }
            }
        }
        return instance;
    }
    public User getUser(String cardld){
        return users.get(cardld);
    }
    public HashMap<String,User> getUsers(){
        return users;
    }
}
