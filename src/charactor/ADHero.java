/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ADHero
 * Author:   zhangjianfa
 * Date:     2020/6/21 15:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package charactor;

import property.Item;
import property.LifePotion;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/21
 * @since 1.0.0
 */
public class ADHero extends Hero implements AD,Mortal{
    int moveSpeed = 400;
    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
    public void attack(){
        physicAttack();
    }

    @Override
    public void die(){
        System.out.println("物理攻击英雄死了");
    }

    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    // 重写useItem，并在其中调用父类的userItem方法
    public void useItem(Item i) {
        System.out.println("ad hero use item");
        super.useItem(i);
    }


    public static void battleWin(){
        System.out.println("ad hero win the battle");
    }

    public static void main(String[] args) {
        ADHero h = new ADHero();
        LifePotion lp = new LifePotion();
        h.useItem(lp);
        Hero.battleWin();
        ADHero.battleWin();
    }
}
