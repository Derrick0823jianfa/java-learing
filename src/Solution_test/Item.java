package Solution_test; /**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution_test.Item
 * Author:   zhangjianfa
 * Date:     2020/4/13 15:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/4/13
 * @since 1.0.0
 */
public class Item {
    String name;
    int price;

    public Item(){
    } //私有化构造方法
    private static Item instance; //静态属性指向实例

    public static Item getInstance(){
        if(instance==null){
            instance = new Item();
        }
        return instance;
    }

    public static void main(String[] args) {
        Item pot = new Item();
        pot.name = "xueping";
        pot.price = 50;


        Item shoe = new Item();
        shoe.name = "caoxie";
        shoe.price = 300;


        Item sword = new Item();
        sword.name = "changjian";
        sword.price = 350;

        }

    }