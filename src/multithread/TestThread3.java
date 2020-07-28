/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestThread3
 * Author:   zhangjianfa
 * Date:     2020/7/24 15:59
 * Description: 测试线程的暂停
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package multithread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试线程的暂停〉
 *
 * @author zhangjianfa
 * @create 2020/7/24
 * @since 1.0.0
 */
public class TestThread3 {
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
        Thread t1 = new Thread(){
            public void  run(){
                int seconds = 0;
                while (true){
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.printf("已经完了LOL %d秒 %n",seconds++ );
                }
            }
        };
        //守护线程；守护线程就相当于那些支持部门，如果一个进程只剩下守护线程，那么进程就会自动结束。
        //守护线程通常会被用来做日志，性能统计等工作。
        t1.setDaemon(true);
        t1.start();


    }
}
