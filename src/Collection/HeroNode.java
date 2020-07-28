/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: HeroNode
 * Author:   zhangjianfa
 * Date:     2020/7/18 15:38
 * Description: 设计一个二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈设计一个二叉树〉
 *
 * @author zhangjianfa
 * @create 2020/7/18
 * @since 1.0.0
 */
public class HeroNode {
    public HeroNode leftHero;
    public HeroNode rightHero;
    public Object hp;
    public Hero value;

    //插入数据
    public void add(Hero h,Object hps){
        if (value==null){
            value = h;
            this.hp = hps;
        }
        else {
            if((int)this.hp>=(int)hps){
                if(leftHero == null){
                    leftHero = new HeroNode();
                }
                leftHero.add(h,hps);
            }
            else {
                if(rightHero == null){
                    rightHero = new HeroNode();
                }
                rightHero.add(h,hps);
            }
        }
    }

    //排好序的二叉树，先遍历右子树，再遍历根节点，最后遍历左子树，遍历出来的结果是到倒序的。
    public List<HeroNode> values() {
        List<HeroNode> values = new ArrayList<>();
        if (rightHero != null)
            values.addAll(rightHero.values());
        values.add(this);
        if (leftHero != null)
            values.addAll(leftHero.values());
        return values;
    }
    public void xianshi(){
        System.out.println("name: "+this.value+"  hp: "+this.hp);
    }

    public static void main(String[] args) {
        System.out.println("初始化多少个");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        HeroNode roots = new HeroNode();

        for (int i = 0; i < x; i++) {
            Hero h = new Hero("hero"+ i);
            Object hp = (int) (Math.random() * 1000);
            roots.add(h,hp);
        }
        List<HeroNode> a = roots.values();
        for(HeroNode b:a){
            b.xianshi();
        }
    }
}
