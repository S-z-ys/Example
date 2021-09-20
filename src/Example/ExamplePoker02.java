package Example;
/*
斗地主综合案例：玩家手中牌有序
    1.准备牌
    2.洗牌
    3.发牌
    4.排序
    5.看牌
 */

import java.util.*;
import java.util.List;

public class ExamplePoker02 {

    public static void main(String[] args) {
        //准备一个map集合，存储牌的索引和组装好的牌
        HashMap<Integer, String> poker02 = new HashMap<>();
        //创建一个list集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义俩个集合，存储花色和牌的序号
        List<String> color = List.of("♠", "♥", "♣", "♦");
        List<String> num = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //把大王和小王存储到集合当中
        //定义一个牌的索引
        int index = 0;
        poker02.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker02.put(index, "小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套遍历俩个集合，组装52张牌，存储到集合当中
        for (String n : num) {
            for (String c : color) {
                poker02.put(index, c + n);
                pokerIndex.add(index);
                index++;
            }
        }

        /*
        2.洗牌
        使用Collections中的方法shuffle(List)
         */
        Collections.shuffle(pokerIndex);

        //定义4个集合用来存储玩家牌的索引，底牌的索引
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        /*
        3.发牌
        遍历存储牌索引的List集合，获取每一个牌的索引
         */
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            //先判断底牌
            if (i >= 51) {
                //给底牌发牌
                diPai.add(in);
            } else if (i % 3 == 0) {
                //给玩家1发牌
                player1.add(in);
            } else if (i % 3 == 1) {
                //给玩家2发牌
                player2.add(in);
            } else {
                //给玩家3发牌
                player3.add(in);
            }
        }
        /*
        4.排序
        使用Collections.sort()方法对集合进行升序排序
         */

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);


        /*
        5.看牌
        调用看牌的方法
         */
        lookPoker("刘义", poker02, player1);
        lookPoker("钱二", poker02, player2);
        lookPoker("赵四", poker02, player3);
        lookPoker("底牌", poker02, diPai);


    }

    /*
    定义一个看牌的方法，提高代码的复用性
    参数：
        String name：玩家名称
        HashMap<Integer,String> poker02:存储牌的poker02集合
        Arraylist<Integer> list :存储玩家和底牌的list集合
    查表法：
         遍历玩家或者底牌的集合，获取牌的索引
         使用牌的索引，去Map集合中，找到对应的牌
     */
    public static void lookPoker(String name, HashMap<Integer, String> poker02, ArrayList<Integer> list) {
        //输出玩家的名称不换行
        System.out.print(name + ": ");
        //遍历玩家或者底牌的集合，获取牌的索引
        for (Integer k : list) {
            //使用牌的索引（key），去Map集合，找到对应的牌（value）
            String value = poker02.get(k);
            System.out.print(value + " ");
        }
        System.out.println();//打完每一个玩家的牌换行
    }
}
