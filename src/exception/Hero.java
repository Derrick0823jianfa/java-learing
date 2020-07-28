/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Hero
 * Author:   zhangjianfa
 * Date:     2020/7/3 14:04
 * Description: 测试自定义异常
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package exception;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试自定义异常〉
 * 1、设置一个子类继承自exception，用一个参数的构造方法传入super（String类型的msg）
 * 2、让具体的实现方法throws这个异常，让内部具体的步骤实现throw new 异常类名
 * 3、在main方法中执行方法时，做try catch
 * @author zhangjianfa
 * @create 2020/7/3
 * @since 1.0.0
 */
public class Hero {
    public String name;
    protected float hp;

    public void attackHero(Hero h) throws EnemyHeroIsDeadException{
        if(h.hp==0)
            throw new EnemyHeroIsDeadException(h.name+"已经挂了，不需要释放技能");
    }

    public static void main(String[] args) {
        Hero gareen = new Hero();
        gareen.hp = 40;
        gareen.name = "Tom";

        Hero temmo = new Hero();
        temmo.name = "Ann";
        temmo.hp = 0;

        try {
            gareen.attackHero(temmo);
        }
        catch (EnemyHeroIsDeadException e){
            System.out.println("异常的原因是"+e.getMessage());
            e.printStackTrace();
        }
    }
}
