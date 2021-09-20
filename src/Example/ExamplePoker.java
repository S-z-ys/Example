package Example;

import java.util.ArrayList;
import java.util.Collections;

/*
斗地主综合案例：
1.准备牌：54张牌，存储到一个集合中
特殊派大王，小王
其它52张牌：
    定义一个数组/集合，存储四种花色
    定义一个数组/集合，存储13个序号：2，A，k...3
循环嵌套遍历俩个数组/集合，组装52张牌
2，洗牌
    使用集合工具类Collections的方法
    static void shuffle(List<?> list) 使用指定的随机源指定列表进行置换。
    会随机的打乱集合中元素的顺序
3，发牌
    要求：1人17张牌，剩余3张作为底牌，一人一张轮流发牌：集合的索引（0~53）%3
    定义4个集合，存储三个玩家的牌和底牌
4，看牌
    直接打印集合，遍历玩家和底牌的集合
 */
public class ExamplePoker {
    public static void main(String[] args) {
        //准备牌
        //定义一个集合ArrayList，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义俩数组，一个数组存储花色，一个数组存储牌的序号
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] num = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //先把大小王放入poker集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历俩个集合，组装52张牌
        for (String n : num) {
            for (String c : color) {
                //System.out.println(c+n);
                //组装好的牌存储到poker集合中
                poker.add(c + n);
            }
        }
        //System.out.println(poker);
        /*
        2.洗牌
         使用集合工具类Collections的方法
        static void shuffle(List<?> list) 使用指定的随机源指定列表进行置换。
        会随机的打乱集合中元素的顺序
         */
        Collections.shuffle(poker);
        /*
        3,发牌
        定义四个集合，存储玩家的牌和底牌
         */
        ArrayList<String> playerOne = new ArrayList<>();
        ArrayList<String> playerTwo = new ArrayList<>();
        ArrayList<String> playerThree = new ArrayList<>();
        ArrayList<String> play = new ArrayList<>();
        /*
        遍历集合poker，获取每一张牌
        使用poker的索引i%3给三位玩家轮流发牌
        剩余三张给底牌
        注意：需要先判断（i>=51），
         */
        for (int i = 0; i < poker.size(); i++) {
            //先判断索引是否大于等于51，免得直接把牌发完
            if (i >= 51) {
                //把poker通过get方法获取赋值给”s“
                String s = poker.get(i);
                //把“s”添加到play集合
                play.add(s);
            } else if (i % 3 == 0) {
                String s = poker.get(i);
                playerOne.add(s);
            } else if (i % 3 == 1) {
                String s = poker.get(i);
                playerTwo.add(s);
            } else {
                String s = poker.get(i);
                playerThree.add(s);
            }
        }
        //打印输出底牌和 玩家手里的牌
        System.out.println(play);
        System.out.println(playerOne);
        System.out.println(playerTwo);
        System.out.println(playerThree);

    }
}