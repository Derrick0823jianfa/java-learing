/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: APHero
 * Author:   zhangjianfa
 * Date:     2020/6/21 15:21
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
public class APHero extends Hero implements AP,Mortal {
    @Override
    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }
    public void attack(){
        magicAttack();
    }
    @Override
    public void die(){
        System.out.println("魔法攻击英雄死了");
    }

}
