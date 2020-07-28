/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestThread
 * Author:   zhangjianfa
 * Date:     2020/7/24 14:45
 * Description: 测试多线程
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package multithread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试多线程的启动〉
 *
 * @author zhangjianfa
 * @create 2020/7/24
 * @since 1.0.0
 */
public class TestThread{
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

        Battle b1 = new Battle(gareen,teemo);
        new Thread(b1).start();

        Battle b2 = new Battle(bh,teemo);
        new Thread(b2).start();

    }

}
