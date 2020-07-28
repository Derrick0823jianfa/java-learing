/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ADAPHero
 * Author:   zhangjianfa
 * Date:     2020/6/21 15:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package charactor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/21
 * @since 1.0.0
 */
public class ADAPHero extends Hero implements AD,AP,Mortal {
    //当实现多个接口，多个接口中出现默认方法名重复时，子类/实现类必须重写这个默认方法
    public void attack(){
        AD.super.attack();
    }
    @Override
    public void physicAttack(){
        System.out.println("物理攻击");
    }
    @Override
    public void magicAttack(){
        System.out.println("魔法攻击");
    }
    @Override
    public void die(){
        System.out.println("特殊英雄死了");
    }

    public static void main(String[] args) {
        ADAPHero adap = new ADAPHero();
        adap.attack();
        adap.revive();
    }

}
