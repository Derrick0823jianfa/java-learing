package charactor;
/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution_test.Hero
 * Author:   zhangjianfa
 * Date:     2020/6/14 15:52
 * Description: 6.14 test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import property.Item;

/**
 * 〈一句话功能简述〉<br> 
 * 〈6.14 test〉
 *
 * @author zhangjianfa
 * @create 2020/6/14
 * @since 1.0.0
 */
public abstract class Hero {

    private String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度
    static String copyright; //版本

    public void useItem(Item i) {
        i.effect();
    }

    public Hero() {
    }

    public Hero(String name) {
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }

    public void finalize() {
        System.out.println("The hero is be recycled.");
    }

    public void kill(Mortal m) {
        m.die();
    }

    public static void battleWin() {
        System.out.println("hero win the battle");
    }

    public abstract void attack();  //抽象类


    // 非静态内部类，只有一个外部类对象存在的时候，才有意义
    // 战斗成绩只有在一个英雄对象存在的时候才有意义
    class BattleScore {
        int kill;
        int die;
        int assit;

        public void legendary() {
            if (kill > 8)
                System.out.println(name + "超神");
            else
                System.out.println(name + "还没有超神");
        }
    }

    //敌方的水晶，静态内部类
    static class EnemyCrystal {
        int hp = 5000;

        //如果水晶的血量为0，则宣布胜利
        public void checkIfVictory() {
            if (hp == 0) {
                Hero.battleWin();

                //静态内部类不能直接访问外部类的对象属性
                //System.out.println(name + " win this game");
            }
        }
    }


    public static void main(String[] args) {

        int damage = 50;

        ADHero adh = new ADHero();
        adh.attack();
        System.out.println(adh);

        //匿名类
        Hero h1 = new Hero() {
            @Override
            public void attack() {
                //在匿名类中使用外部的局部变量，外部的局部变量必须修饰为final
                System.out.printf("造成%d点伤害", damage);

            }
        };
        h1.attack();
        System.out.println(h1);

        //与匿名类的区别在于，本地类有了自定义的类名
        class someHero extends Hero {
            public void attack() {
                System.out.println("new attack ways");
            }
        }
        someHero h = new someHero();
        h.attack();
        }
}