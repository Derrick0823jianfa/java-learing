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
public class Hero {
    public String name; //定义英雄名字
    public float hp; //定义英雄血量

    public int damage; //定义英雄能够造成的伤害

    //回血
    //直接在方法前加上修饰符synchronized
    //其所对应的同步对象，就是this
    //和hurt方法达到的效果一样
    public synchronized void recover(){
        hp += 1;
    }
    //掉血
    public void hurt(){
        synchronized (this) {
            hp -= 1;
        }
    }

    public void attackHero(Hero h) {
//        try {
//            //为了表示攻击需要时间，每次攻击暂停1000毫秒
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);

        if(h.isDead())
            System.out.println(h.name +"死了！");
    }

    public boolean isDead() {
        return hp <= 0;
    }

}
