/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestThread4
 * Author:   zhangjianfa
 * Date:     2020/7/28 20:35
 * Description: 测试线程同步问题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package multithread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试线程同步问题〉
 *
 * @author zhangjianfa
 * @create 2020/7/28
 * @since 1.0.0
 */
public class TestThread4 {
    public static void main(String[] args) {
        //final修饰引用的时候，只能指向一次
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 10000;

        System.out.printf("盖伦刚开始的血量是 %.0f%n",gareen.hp);

        //创建10000个增加血量的线程和减少血量的线程
        int n = 10000;
        Thread [] addThread = new Thread[n];
        Thread [] reduceThread = new Thread[n];

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                @Override
                public void run() {
                    gareen.recover();
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThread[i] = t;
        }

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                @Override
                public void run() {
                    gareen.hurt();
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            reduceThread[i] = t;
        }

        for (Thread t:addThread){
            try {
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        for (Thread t:reduceThread){
            try {
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.printf("%d个增加线程，%d个减少线程结束后%n盖伦的血量变为 %.0f%n",n,n,gareen.hp);



    }
}
