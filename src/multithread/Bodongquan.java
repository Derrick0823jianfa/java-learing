/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Hero
 * Author:   zhangjianfa
 * Date:     2020/7/14 20:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package multithread;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/14
 * @since 1.0.0
 */
public class Bodongquan {
    public String name; //定义英雄名字
    public float hp; //定义英雄血量

    public int damage; //定义英雄能够造成的伤害

    public static void main(String[] args) {
        //匿名类实现建立线程
        Thread t1 = new Thread() {
            public void run() {
                while(true){
                    for (int i = 0; i < 3; i++) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.printf("波动拳第%d发 %n", i+1);
                    }
                    System.out.println("开始5s的充能");
                    try {
                        Thread.sleep(5000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
    }
}
