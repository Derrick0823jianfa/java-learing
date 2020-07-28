/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestThread2
 * Author:   zhangjianfa
 * Date:     2020/7/24 15:14
 * Description: 多线程的第三种方法------使用匿名类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package multithread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈多线程的第三种方法------使用匿名类〉
 *
 * @author zhangjianfa
 * @create 2020/7/24
 * @since 1.0.0
 */
public class TestThread2 {
    public static void main(String[] args) {
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        //匿名类
        Thread t1 = new Thread(() -> {
            while(!teemo.isDead()){
                gareen.attackHero(teemo);
            }
        });

        Thread t2 = new Thread(() ->{
            while (!leesin.isDead()){
                Thread.yield();

                bh.attackHero(leesin);
            }
        });

        t1.setPriority(5);
        t1.setPriority(5);
        t1.start();
        t2.start();
    }
}
